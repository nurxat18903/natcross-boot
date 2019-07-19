package person.pluto.system.service.impl;

import person.pluto.system.entity.User;
import person.pluto.system.mapper.UserMapper;
import person.pluto.system.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;


/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Pluto
 * @since 2019-07-18 17:13:41
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {


}