package S52.DiceGame.RosIvan.S52.DiceGame.RosIvan.dto.SQL;

import S52.DiceGame.RosIvan.S52.DiceGame.RosIvan.Domain.SQL.GameSql;
import S52.DiceGame.RosIvan.S52.DiceGame.RosIvan.Domain.SQL.UserSql;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GameDtoSql {

    //Get from Mysql in the userSqls BBDD
    private UserSql userSql;
    private int dice1;
    private int dice2;
    private boolean winner;
    private String timeRegistration;

}
