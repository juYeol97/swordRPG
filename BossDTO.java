import java.util.HashMap;
import java.util.List;

public class BossDTO {
    
    private String bossType ;                   // 보스의 타입 설정                 ex) 화
    private int bossHp;                         // 보스의 HP를 설정할 bossHp        ex) 1000
    private int bossDmg;
    private HashMap<String, Integer> bossSkill;     // 보스의 스킬과 데미지 bossSkill   ex) 몸통박치기, 100


 
    // 보스 타입 게터 / 세터
    public String getBossType() {
        return bossType;
    }
    public void setBossType(String bossType) {
        this.bossType = bossType;
    }

    // 보스 Hp 게터 / 세터
    public int getBossHp() {
        return bossHp;
    }
    public void setBossHp(int bossHp) {
        this.bossHp = bossHp;
    }

    // 보스 데미지 게터 / 세터
    public int getBossDmg() {
        return bossDmg;
    }
    public void setBossDmg(int bossDmg) {
        this.bossDmg = bossDmg;
    }

    // 보스 스킬 게터 / 세터
    public HashMap<String, Integer> getBossSkill() {
        return bossSkill;
    }
    public void setBossSkill(HashMap<String, Integer> bossSkill) {
        this.bossSkill = bossSkill;
    }

    
    







}
