package site.zxhy.wowhub.entry;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@TableName("user")
public class User {
    @TableId
    private String id;
    private String username;
    private String password;
    private String email;
    private String nickname;
    private String avatarName;
    private String avatarPath;
    private String avatarAbsolutePath;
    private Boolean enabled;
    private Boolean locked;
}
