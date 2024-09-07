package com.edu.seiryo;

import org.springframework.batch.item.ItemProcessor;

public class CustomizeItemProcessor implements ItemProcessor<User,User> {
    @Override
    public User process(User item) throws Exception {
        return item.getId() % 2 != 0 ? item : null;
    }
}
