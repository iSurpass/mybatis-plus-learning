package bean;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * @author Juniors
 */
// 此实体类对应的数据库中的表名
@TableName(value = "tbl_employee")
public class Employee {

    // 选择 Integer 初始化对象中在数据库中没有默认值
    // 如果是 int 类型会默认值为 0
    // 如果是 boolean 默认值为 false
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    private String lastName;

    private String mail;

    private Integer gender;

    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
