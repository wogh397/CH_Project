
import java.util.Scanner;

public class MarketManager {
    Scanner sc = new Scanner(System.in);

    void run() {
        userSelect();

    }


    void userSelect() {
        while (true) {
            System.out.println("""
                    북마켓에 오신것을 환영합니다!
                    숫자로 선택해주세요
                    1. 책 검색
                    2. 장바구니 확인
                    3. 영수증 출력
                    4. 결제
                    """);
            int select = 0;
            try {
                select = sc.nextInt();
            } catch (Exception e) {
                System.out.println("숫자를 입력해주세여");
                sc.nextLine();
            }

            switch (select) {
                case 1:
                    SearchBook();
                    break;
                case 2:
                    cartList();
                    break;
                case 3:
                    showBill();
                    break;
                case 4:
                    payment();
                    break;
            }
        }
    }
    void SearchBook(){
        System.out.println("""
                검색하실 카테고리를 선택해주세요
                1.책 이름
                2.저자
                3.분류
                4.가격순
                """);
        int choice  = sc.nextInt();
        switch (choice){
            case 1:
                findBook();
                System.out.println("책 이름으로 검색");
                break;
            case 2:
                System.out.println("책 저자이름으로 검색");
                break;
            case 3:
                System.out.println("책 분류별로 검색");
                break;
            case 4:
                System.out.println("가격순으로 정렬");
                break;
        }
    }
    void cartList(){
        System.out.println("현재 장바구니 리스트입니다");
    }
    void showBill(){
        System.out.println("영수증 출력중");
    }
    void payment(){
        System.out.println("결제하기");
    }



    BookCart[] books=new BookCart[3];
    public MarketManager(){
        books[0]=new BookCart("1","글쓴이1","문학",1000);
        books[1]=new BookCart("2","글쓴이2","경제",2000);
        books[2]=new BookCart("3","글쓴이3","사회",3000);
    }

    public void findBook() {
        System.out.println("검색할 책이름을 입력해주세요");
        String bookname= sc.nextLine();
        for(int i=0;i<3;i++){
            
        }
    }
}
