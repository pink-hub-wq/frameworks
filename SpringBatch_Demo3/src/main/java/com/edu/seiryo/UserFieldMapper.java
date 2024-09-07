package com.edu.seiryo;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.boot.context.properties.bind.BindException;

public class UserFieldMapper implements FieldSetMapper<User2> {
    @Override
    public User2 mapFieldSet(FieldSet fieldSet) throws BindException {

        User2 User = new User2();
        User.setId(fieldSet.readLong("id"));
        User.setAge(fieldSet.readInt("age"));
        User.setName(fieldSet.readString("name"));
        String addr = fieldSet.readString("province") + " "
                + fieldSet.readString("city") + " " + fieldSet.readString("area");
        User.setAddress(addr);
        return User;
    }
}
