package com.xbd.provider;

import com.xbd.demoapi.entity.RetMessage;
import com.xbd.demoapi.entity.Student;
import com.xbd.demoapi.service.DemoApi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoApiImpl implements DemoApi {
    /**
     * 学生信息List,存放学生信息，本来打算在数据库中增删，为了简化例子，直接用一个List代替;
     * 若是连接数据库进行增删改查，在此处调用dao层接口即可
     */
    List<Student> stuList = new ArrayList<>();

    /**
     * 获取
     **/
    @Override
    public Student getInfoById(String Id) {
        Student stu = this.getInfo(Id);
        return stu;
    }

    @Override
    public RetMessage insertInfo(Student stu) {
        RetMessage ret = new RetMessage();
        ret.setSuccess(false);
        if(stu!=null && !isBlank(stu.getStuId()) && !isBlank(stu.getName())){
            Student stuVo = this.getInfo(stu.getStuId());
            if(stuVo != null) {
                ret.setMessage("该用户已存在！");
            } else{
                stuList.add(stu);
                ret.setSuccess(true);
                ret.setMessage("成功");
            }
        } else {
            ret.setMessage("数据不全，请检查！");
        }
        return ret;
    }

    @Override
    public RetMessage deleteById(String Id) {
        RetMessage ret = new RetMessage();
        ret.setSuccess(false);
        if(!isBlank(Id)) {
            int len = stuList.size();
            for(int i = 0; i < len; i++) {
                if(Id.equals(stuList.get(i).getStuId())){
                    stuList.remove(i);
                    ret.setSuccess(true);
                    ret.setMessage("成功!");
                    break;
                }
            }
        } else {
            ret.setMessage("Id为空，请检查输入数据");
        }
        return ret;
    }

    private Student getInfo(String Id){
        Iterator<Student> it = stuList.iterator();
        Student stu = null;
        while (it.hasNext()) {
            stu = it.next();
            if(stu.getStuId().equals(Id)){
                break;
            }
        }
        return stu;
    }

    private boolean isBlank(String value){
        return value == null || "".equals(value) || "null".equals(value);
    }
}
