package cc.openkit.admin.dao;

import cc.openkit.admin.model.User;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

@Component
public interface UserMapper extends Mapper<User> {

}