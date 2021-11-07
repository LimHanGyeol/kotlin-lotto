# kotlin-lotto

# 1. 문자열 덧셈 계산기
## 기능 요구 사항
* 쉼표(,)또는 콜론(:)을 구분자로 갖는 문자열을 전달하는 경우,  
구분자를 기준으로 분리한 각 숫자의 합을 반환할 수 있다.  
  Ex) "" -> 0, "1,2" -> 3, "1,2:3" -> 6
* 앞의 기본 구분자(쉼표, 콜론) 외에 커스텀 구분자를 지정할 수 있다.  
커스텀 구분자는 문자열 앞 부분의 "//"와 "\n" 사이에 위치하는 문자를 커스텀 구분자로 사용한다.
  예를 들어 "//;\n1;2;3"과 같이 값을 입력할 경우 커스텀 구분자는 세미콜론(;)이며,  
결과 값은 6이 반환되어야 한다.
* 문자열 계산기에 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException을 throw 한다.

## 요구 사항 정리
- [X] 문자열 식을 입력할 수 있다.
- [X] 식에 0이 입력될 경우 0을 반환한다.
- [X] 식에 1이 입력될 경우 1을 반환한다.
- [X] 식은 쉼표(,)와 콜론(:)을 구분자로 가질 수 있다.
- [X] 구분자를 기준으로 식을 분리할 수 있다.
- [X] 식에 숫자 이외의 값 또는 음수가 입력 될 경우 RuntimeException을 throw 한다.
- [X] 분리한 식의 합을 반환한다.
- [X] 커스텀 구분자를 가질 수 있다.
- [X] 커스텀 구분자는 "//"와 "\n" 사이의 값을 사용한다.
- [X] 커스텀 구분자를 기준으로 식을 분리하고 그 합을 반환한다.

# 2. Lotto(자동)
## 기능 요구 사항
* 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급해야 한다.
* 로또 1장의 가격은 1000원이다.

## 요구 사항 정리
- [X] 구입 금액을 입력할 수 있다.
- [X] 로또 1장의 가격은 1000원이다.
- [X] 1000원 단위로 구매한 로또의 개수를 반환한다.
- [X] 구입 금액이 1000 단위로 나누어지지 않다면 IllegalArgumentException 예외를 발생시킨다.
- [X] 1부터 45까지의 로또 번호를 만들 수 있다.
- [X] 로또 번호를 섞을 수 있다.
- [X] 섞인 로또 번호 중 6개를 뽑고, 정렬할 수 있다.
- [X] 한장의 로또를 만들 수 있다.
- [X] 여러장의 로또를 만들 수 있다.
- [X] 구매한 수만큼 로또를 만들 수 있다.
- [X] 구매한 로또의 번호를 출력할 수 있다.
- [X] 당첨 번호를 입력할 수 있다.
- [X] 당첨 번호는 6개를 입력할 수 있으며, 각 번호는 1 ~ 45의 범위를 벗어날 수 없다.
- [X] 구매한 로또와 당첨 번호를 비교할 수 있다.
- [X] 구매한 로또가 당첨 번호를 몇개 갖고 있는지 확인할 수 있다.
- [X] 당첨 결과를 정의한다.
- [X] n개의 로또 당첨 번호를 확인할 수 있다.
- [X] n개의 당첨 결과를 수집할 수 있다.
- [X] 당첨 결과를 출력할 수 있다.
- [X] 수익률을 계산할 수 있다.
- [X] 수익률을 출력할 수 있다.

# 3. Lotto(2등)
## 기능 요구 사항
* 2등을 위해 추가 번호를 하나 더 추첨한다.
* 당첨 통계에 2등도 추가해야 한다.

## 요구 사항 정리
- [X] 보너스 번호를 입력받을 수 있다.
- [X] Rank에 2등을 추가할 수 있다.
- [X] 통계에 2등을 포함하여 출력할 수 있다.

# 4. Lotto(수동)
## 기능 요구 사항
* 현재 로또는 자동 생성 기능만 제공한다.
* 사용자가 수동으로 추첨 번호를 입력 할 수 있도록 해야한다.

## 요구 사항 정리
- [X] 수동 구매할 로또 수를 입력 받을 수 있다.
- [X] 수동으로 구매할 로또 번호를 입력 받을 수 있다.
- [X] 수동으로 입력받은 로또번호를 만들 수 있다.
- [X] 수동 입력 후 남은 로또 구매 수를 자동으로 만든다.
- [X] 수동으로 n장, 자동으로 n장 구매 View를 출력한다.
- [X] LottoNumbers에 수동으로 입력받은 번호 먼저 배치한다.
