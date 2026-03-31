import java.util.HashMap;

public class setBossOptions 
{
    BossDTO dto = new BossDTO();
    HashMap<String, Integer> bossSkill;


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
    
    // 보스 한마리의 
    private BossDTO bossStatus(int bossType)
    {
        
        if(bossType == 0)
        {
            
            dto.setBossType("fire");
            dto.setBossHp(1500);
            bossSkill.put("물어뜯기", 150);
            bossSkill.put("화염방사", 200);
            bossSkill.put("초고열용광로", 250);
            bossSkill.put("분노", 0);
        }

        if(bossType == 1)
        {
            dto.setBossType("water");
            dto.setBossHp(2000);
            dto.setBossSkill("ㅁㄹ",12);
            bossSkill.put("물대포", 170);
            bossSkill.put("깨물기", 150);
            bossSkill.put("하이드로펌프", 230);
            bossSkill.put("난동", 200);

        }

        if(bossType == 2)
        {
            dto.setBossType("nature");
            dto.setBossHp(1700);
            bossSkill.put("잎날가르기", 180);
            bossSkill.put("광합성", 0);
            bossSkill.put("솔라빔", 300);
            bossSkill.put("박치기", 130);
        }



        return 
    }


}
