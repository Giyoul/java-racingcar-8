# java-racingcar-precourse

## 📝 구현 기능 목록

### 1. 입출력 기능

- 사용자에게 자동차 이름 입력 메시지를 출력한다
- 사용자에게서 자동차 이름을 입력받는다.
- 시도할 횟수 입력 메시지를 출력한다.
- 시도할 횟수를 입력받는다.
- ‘실행 결과’ 메시지를 출력한다.
- 차수별 실행 결과 메시지를 출력한다.
- 최종 우승자를 출력한다.

### 2. 핵심 로직 기능

- n대의 자동차는 주어진 횟수 동안 전진 또는 멈춘다
- 자동차 이름을 ‘,’ 기준으로 구분한다.
- 각 자동차 이름을 저장한다.
- 각각의 자동차는 무작위 값이 4 이상일 경우 전진한다.
- 우승자가 여러명일 경우 “, “으로 구분하여 공동 우승자를 표시한다.

### 3. 예외 처리 기능

- 이름을 “,” 구분으로 구분하지 않을 경우 `IllegalArgumentException` 을 발생시킨 후 app을 종료시킨다.
- 이름 입력이 비어있을 경우 `IllegalArgumentException` 을 발생시킨 후 app을 종료시킨다.
- 시도할 횟수를 입력하지 않았을 경우 `IllegalArgumentException` 을 발생시킨 후 app을 종료시킨다.
- 시도할 횟수가 Integer가 아닐 경우 `IllegalArgumentException` 을 발생시킨 후 app을 종료시킨다.
- 지정한 이름이 6글자 이상일 경우에  `IllegalArgumentException` 을 발생시킨 후 app을 종료시킨다.

### 4. 기타

- 프로그램 종료시에 Console.close을 호출한다

---

## 💌 커밋 컨벤션

Following convention : https://gist.github.com/stephenparish/9941e89d80e2bc58a153

```bash
# basic structure
<type>(<scope>): <subject>
<BLANK LINE>
<body>
<BLANK LINE>
<footer>

# <type>
feat (feature)
fix (bug fix)
docs (documentation)
style (formatting, missing semi colons, …)
refactor
test (when adding missing tests)
chore (maintain)

# <scope>
console - I/O
domain - 핵심 로직
validation - 유효성검사
test - 테스트코드 추가
```