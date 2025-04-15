package ch12;

public class StringEx {

	public static void main(String[] args) {
		//indexOf
		String greet = "안녕하세요";
		System.out.println(greet.indexOf("하"));
		// 단어의 포함 여부(없으면 -1, 있으면 0이상)
		if(greet.indexOf(".") > -1) {		//매개변수가 문자열에 있는지
			
		} else {
			
		}
		// 동적으로 이 값부터 잘라내야 되는 경우
		System.out.println(greet.substring(greet.indexOf("하")));
		
		String test = "abc";
		
		//대문자로 바꿔주는 함수(toUpperCase)
		//소문자 : toLowerCase()
		System.out.println(test.toUpperCase());
		
		//앞,뒤 공백제거
		//trim은 중간에 있는 공백은 제거 안됨
		test = "           a    bc                    ";
		System.out.println(test.trim());
		
		//모든 공백 제거
		System.out.println(test.replace(" ", ""));
		
		//특정 문자열로 시작하는 지 여부
		test = "Mr.Lee";
		System.out.println(test.startsWith("Mr"));
		
		//특정 문자열로 끝나는 지 여부
		System.out.println(test.endsWith("e"));
		
		//문자열로 변환
		int a = 1;
		String a2 = String.valueOf(a);
		Integer b = 1;
		String b2 = String.valueOf(b);
		
		//퀴즈
		String fileName = "2025.04.10_시간표.xlsx";
		// 파일명을 변경 System.currentTimeMillis -> 17......xlsx
		// 확장자는 그대로 두고 파일명만 변경
		String newFileName = System.currentTimeMillis() + fileName.substring(fileName.indexOf("."));
		System.out.println(newFileName);
	
		test.toUpperCase().replace(" ", "").substring(2).indexOf(1);
		
		//append, toString 기억하기
		//append()로 합치는 것과 출력 시 toString()으로 사용해야 한다.
		StringBuilder sb = new StringBuilder();
		sb.append(1).append(2).append(3);
		String name = sb.toString();
		System.out.println(sb);
		
		System.out.println(get("id", 30));
		
	}
	
	//아이디와 나이(정수, 문자)를 입력받아 합쳐서 리턴
	public static String get(String id, Object age) {
		return id + age;
	}

}
