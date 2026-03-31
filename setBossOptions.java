import java.util.Map;

public class setBossOptions 
{
    BossDTO dto = new BossDTO();
    Map<String, Integer> bossSkill;


    public BossDTO setBoss()
    {
        
        
        int bossType;

        return BossDTO;
    }

    
    // 보스 타입을 랜덤하게 설정
    private int setBossType()
    {

        // 0번 화속성, 1번 수속성, 2번 풀속성
        int bossType = (int)(Math.random() * 3);
        
        // 0, 1, 2 중 반환
        return bossType;
    }
    
    private int bossStatus(int bossType)
    {
        
        if(bossType == 0)
        {
            
            dto.setBossType("fire");
            dto.setBossHp(1000);
            bossSkill.put("물어뜯기", 150);
            bossSkill.put("화염방사", 200);
            bossSkill.put("초고열용광로", 250);
            bossSkill.put("분노", 0);
        }








        return 0;
    }


}
