import java.util.HashMap;

public class SetBossOptions 
{
    
    // 생성자
    public SetBossOptions()
    {
        setBossStatus();    // 설정된 보스 1마리 리턴
    }
 
    // 보스 한마리의 타입과 스테이터스를 설정
    private BossDTO setBossStatus()
    {
        
        // 보스 한마리 객체 DTO, 보스 스킬을 담을 자료구조
        BossDTO dto = new BossDTO();
        HashMap<String, Integer> bossSkill = null ;


        // 0번 화속성, 1번 수속성, 2번 풀속성
        int bossType = (int)(Math.random() * 3);
        
        // 보스 타입에 따른 스테이터스 설정
        if(bossType == 0)
        {
            dto.setBossType("fire");
            dto.setBossHp(1500);
            bossSkill.put("물어뜯기", 150);
            bossSkill.put("화염방사", 200);
            bossSkill.put("초고열용광로", 250);
            bossSkill.put("분노", 0);
            dto.setBossSkill(bossSkill);
        }

        if(bossType == 1)
        {
            dto.setBossType("water");
            dto.setBossHp(2000);
            bossSkill.put("물대포", 170);
            bossSkill.put("깨물기", 150);
            bossSkill.put("하이드로펌프", 230);
            bossSkill.put("난동", 200);
            dto.setBossSkill(bossSkill);
        }

        if(bossType == 2)
        {
            dto.setBossType("nature");
            dto.setBossHp(1700);
            bossSkill.put("잎날가르기", 180);
            bossSkill.put("광합성", 0);
            bossSkill.put("솔라빔", 300);
            bossSkill.put("박치기", 130);
            dto.setBossSkill(bossSkill);
        }

        // 보스 1마리 리턴
        return dto;
    }


}
