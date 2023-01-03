### 동작 화면
![이미지](https://user-images.githubusercontent.com/46879264/210290214-7153cc2f-1250-4c8c-99a9-4702c3879214.gif)

### 기능 구현
- [X] 확장자 등록하기
- [X] 확장자 삭제하기
- [X] 화면에 커스텀 확장자 보여주기
- [X] 화면에 고정 확장자 보여주기

## 주요 내용

### 1. 확장자 등록, 삭제 상태 관리

등록되었는지 삭제되었는지 등의 상태는 백엔드에서 관리하게 만들었습니다.<br>
프론트에서는 단순히 "차단된 확장자 목록"을 받습니다.<br>

이 목록으로 `고정 확장자`, `커스텀 확장자` 태그를 채웁니다.<br>
프론트에서 확장자 추가/삭제 요청을 보낼 수 있습니다.<br>
`고정 확장자`, `커스텀 확장자` 목록을 지우고 "차단된 확장자 목록"을 요청하여 다시 만듭니다.<br>

### 2. 화면에 보여지는 뷰 만들기

커스텀 확장자 아래에 보여지는 `버튼 + 텍스트` 박스를 동적으로 만들어야 했습니다.<br>
jquery 등을 사용할까 고민했지만, 비교적 단순한 작업이라 직접 자바스크립트를 이용하여 만들었습니다.

### 3. 커스텀 확장자에서 고정 확장자를 등록해야하나?

커스텀 확장자에 고정 확장자를 타이핑하고 등록하면 등록되게 구현했습니다.

### 4. 예외 처리는 어떻게 할까?

확장자의 길이, 중복여부, 정규표현식 여부를 고려했습니다.<br>
길이 체크는 스프링 기능을 이용했습니다.<br>
중복 여부는 직접 데이터베이스에 쿼리를 보내 확인했습니다.<br>
정규 표현식으로 확장자를 차단하는 기능은 구현하지 못했습니다.

### 4. 작업물 어떻게 보여줄까?

텍스트나 이미지보다는 동작하는 모습을 보여주고 싶어 영상을 첨부했습니다.
