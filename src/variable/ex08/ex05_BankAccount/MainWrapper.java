package variable.ex08.ex05_BankAccount;

public class MainWrapper {

  public static void main(String[] args) {
//    Bank bank = new Bank("국민은행가산지점", "02-111-1111");
//    bank.info();  // 국민은행가산지점(02-111-1111)
//
//    BankAccount acc = new BankAccount(bank, "012-34-56789", 50000);
//    acc.info();  // 계좌번호: 012-34-56789, 통장잔액: 50000원
//                 // 개설지점: 국민은행가산지점(02-111-1111)
//    
//    BankMember member = new BankMember("홍길동", acc);
//    member.info();  // 고객명: 홍길동
                    // 계좌번호: 012-34-56789, 통장잔액: 50000원
                    // 개설지점: 국민은행가산지점(02-111-1111)
    
    Bank bank1 = new Bank();
    // Bank 클래스의 타입으로 주소값담을수있는 bank1 생성후 실제 객체 생성후 그 주소값을 bank1에 담음
    bank1.setFAccName("우리은행");
    // bank1로 객체 생성했으니까 Bank의 setFAccName 보면됨
    bank1.setFTelNo("02-222-2222");
    // 이것도 타서 저장했음 FTelNo에
    
    
    BankAccount acc1 = new BankAccount();
    // 이번엔 뱅크어카운트 클래스 타입의 주소값을 담을수있는 acc1 생성하고
    // 거기에 뱅크 어카운트 객체를 생성해서 주소값을 acc1에 담았음 () 생성자로초기화
    acc1.setBank(bank1);
    // acc1에 셋뱅크 즉 뱅크어카운트의 acc1실행 bank1넣고
    // 이쪽이 좀 어렵네....;;;
    acc1.setAccNo("012-34-56789");
    // 음 바로 acc1에 뱅크어카운트의 setAccNO 실행
    // 이거야 쉽지 바로 저장하는거네

    acc1.setBalance(10000);
    // 똑같이 ACC1에 밸런스를 ~ 넣자!
    
    BankMember member1 = new BankMember();
    // 이번엔 뱅크넘버클래스의 타입!!으로 만든 member1 <= 객체 주소를 담을수있는
    // 참조변수를 생성하여 new 로 객체 생성 BankMember를 본따서? 만들고 () 생성자로 초기화
    member1.setMemName("상철");
    // 그럼 BankMember에서 setMemName찾으면됨 물론 실제로는 member1꺼지만 찾는건 거기서
    member1.setBankAcc(acc1);
    // 그담은 밸런스 저장!인대 acc1?????로 준다
    // acc1은 뱅크어카운트 타입이니까 분명 매개변수도 BankAccount 들어갈거라 예상중!!
    // 그럼여기서 의문!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    // acc1은 객체의 주소값을 저장한 참조변수인대 참조변수를 통째로 넘기면 어캄??
    // 아 주소값이 넘어가는구나 주소값이 저장되어있으니까 그것까진 알겠음
    // 그럼 주소값이 넘어가져서 어캐됨?
    // 주소값을 그대로 저장하는거잖아 bankAcc에?
    // 그냥 member1.bankAcc = acc1; 이렇게 직접 필드에 넣어버리면 되잖아?
    // 근대 근데 OOP(객체 지향)에서는 필드를 private으로 숨겨서 직접 접근 못하게 막음 (캡슐화)
    // 해서 setter 메서드를 통해서만 주소값을 넣을수있게(안전) 한다고함
    // 일단 아예 안넘어가지니까 다음

    
    
    System.out.println("고객명: " + member1.getMemName());
    // 출력할거임 고객명은 뱅크맴버에있는 getNemName 사용
    System.out.println("계좌번호: " + member1.getBankAcc().getAccNo());
    // 출력할거임 계좌번호는 뱅크맴버에있는 getBankACC와 getAccNo 사용

    // 갑자기 터지는부분

    //    System.out.println("계좌번호: " + member1.getBankAcc().getAccNo());
    //
    //여기서 member1은     BankMember member1 = new BankMember();
    //니까 BankMember에서 getBankAcc()를 찾아봤어 그니까
    //
    //  public BankAccount getBankAcc() {
    //    return bankAcc;
    //  }
    //이게 있는대 아까
    //  public void setBankAcc(BankAccount bankAcc) {
    //    this.bankAcc = bankAcc;
    //  }
    //여기서 저장했지 근대 분명
    //    member1.setBankAcc(acc1);
    //
    //이걸로 저장했을거란말이야
    //근대 acc1은     // 이번엔 뱅크어카운트 클래스 타입의 주소값을 담을수있는ㄱ거니까
    //주소값이 담겨져있는거아님?

    // 아!!!!!!!!!!!!!!!!!!
    // 아 잠만 System.out.println("계좌번호: " + member1.getBankAcc().getAccNo());
    // 내가 그럼 지금 이해한건 member1에 getBacnkACC()를 출력하고 get AccNO()도 따로 출력해라
    // 이게아니고 member1.getBankAcc()는 acc의 주소를 아까 담아놨으니까 결국
    // member1.getBankAcc() = acc의 주소 즉 acc고 member1.getBankAcc().getAccNo());
    // 이말인즉슨 acc.getAccNo());랑 같은말로 acc의 getAccNo());를 실행해라
    // 이런뜻이야????????

    // 맞다고함 ㄷㄷㄷㄷㄷㄷㄷㄷㄷㄷㄷㄷ 스샷저장완료

    System.out.println("통장잔액: " + member1.getBankAcc().getBalance());
    // 다음 뱅크맴버에 getBankAcc 아 또 acc겠구나.의 즉 뱅크어카운트의
    // getBalance를 실행해서 리턴값 balance를 가져와라 이건가보네!!!!!!!!!!!!!

    System.out.println("개설지점: " + member1.getBankAcc().getBank().getFAccName());
//    그럼 이것도 같다....이번엔 acc의 즉 뱅크어카운트의 getBank인대
//     this.bacnk이므로 먼저쓴 뱅크를 찾아보면 setBank에 있음
//     이것도 결국 뱅크1이네 ㅋㅋ 앞에 3단어가 ㅋㅋㅋ 뱅크1에 getFaccName찾아보자
//     즉 member1.getBankACC = ACC고 뱅크어카운트에서 찾아보면 getBank가 있음
//     여기서 return뱅크니까 bank를 다시 찾아가면 위엣 먼저 setBank를 했음
//     그걸 따라가면 여기 29번째줄 나옴 여기서 시작 그럼 결국
//     가르키는건 Bank임ㅋㅋㅋ 3단어가 다 뱅크를 가르킴 맞는지 확인하려면
//     bank에 getFAccName이 있어야함 찾아보는중
//     캬 있습니다!!!!!!! 그럼 결국 그냥 이거 출력이네
//       public String getFAccName() {
//        return fAccName;
//      }
//     찾아가는게 개핼이다 물어보자 ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ

    System.out.println("지점연락처: " + member1.getBankAcc().getBank().getFTelNo());
    // 이것도 똑같으니까 뱅크에 있겠네 결국 뱅크에있는 getFTelNO 출력이겠네
    // 결국 간단하게 Bank에 fTelNo 실행하라는거잖아 ㅋㅋㅋㅋㅋㅋㅋ

    Bank bank2 = new Bank();
    // 아오 이제 드디어 다음?이다 뱅크 2생성
    bank2.setFAccName("국민은행");
    // 음 비슷한거같네 이번엔 2지만 이름저장
    bank2.setFTelNo("02-333-3333");
    
    
    BankAccount acc2 = new BankAccount();
    // 이것도 계좌2만든거고 BankAccount 클래스타입의 주소를 담을수있는
    // 참조변수 생성하고 new BankAccount로 객체 생성후 () 초기화후 주소 담음
    acc2.setBank(bank2);
    // 이것도 하고
    acc2.setAccNo("987-365-43210");
    // 이것도 저장
    acc2.setBalance(10000);
    // 이것도 똑같이 저장
    
    BankMember member2 = new BankMember();
    member2.setMemName("영숙");
    // 이번엔 영숙임
    member2.setBankAcc(acc2);
    // 계좌 저장했음!
    
    
    System.out.println("고객명: " + member2.getMemName());
    // ㅇㅋ 이건 쉽다이제 출력이고
    System.out.println("계좌번호: " + member2.getBankAcc().getAccNo());
    // 이것도 비슷한 방식이곘지 찾아가보면 ㅇㅋ 즉 뱅크어카운트에 getAccNO 실행
    // 그래서 return accNo가 되는거임
    System.out.println("통장잔액: " + member2.getBankAcc().getBalance());
    // 이것도 뱅크어카운트에 getBalance()); 타서 반환하는대 balance는 어캐되있냐
    // 셋발란스에 있던게 그대로 저장되어있네 ㅇㅋ 1만 출력
    System.out.println("개설지점: " + member2.getBankAcc().getBank().getFAccName());
    // 또 이것도 찾아가보면 또 뱅크어아운트에 getBank 가야하네 return bank니까
    // 기존 저장된 bank는 셋뱅크이고 bank2저장이고 bank2 는 bank 참조니까 bank안에
    // getFAccName찾으면됨 첨에  setFAccName으로 저장했네 국민은행으로 ㅋㅋ
    System.out.println("지점연락처: " + member2.getBankAcc().getBank().getFTelNo());
    // 그럼 이것도 마지막에 뱅크에     bank2.setFTelNo("02-333-3333");
    // 이거 출력되겠네 ㅋㅋ

    //앆!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    
    // 이체 
    member1.transfer(member2, 10000);
    // 뱅크맴버에 트랜스퍼실행 // 맴버2로 줄거니까
    // 그 타입인 뱅크맴버클래스로 받아야함 / 결국 0됨
    member1.info();
    // 결국 뱅크어카운트의 info 실행
    // 이것저것 출력되는대 발란스는 0일거고
    // 띄어쓰기 될거고
    member2.info();
    // 이것도 마찬가지임ㅋㅋ 아
    
    
    
    
  }

}
