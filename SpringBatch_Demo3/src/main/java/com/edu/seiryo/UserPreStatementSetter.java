package com.edu.seiryo;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.batch.item.database.ItemPreparedStatementSetter;

public class UserPreStatementSetter implements ItemPreparedStatementSetter<User> {
    @Override
    public void setValues(User user, PreparedStatement ps) throws SQLException {
        ps.setLong(1, user.getId());
        ps.setString(2, user.getName());
        ps.setInt(3, user.getAge());
    }
}
