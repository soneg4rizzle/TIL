# 람다식 ( Lamda Expressions )


> 람다식은 함수(Method)를 간단한 식(Expression)으로 표현하는 방법을 말합니다.
> 만약 아래와 같은 메소드가 존재한다면,
```java
int max(int a, int b) {
  return a > b ? a : b;
}
```
> 위의 식은 아래와 같은 람다식으로 표현이 가능합니다.
```java
(a, b) -> a > b ? a : b
```
> 일반 메소드를 람다식으로 만들기 위해서는 메소드의 반환타입과 이름을 지우는 방법으로 만들어지기 때문에
> 익명 함수( 이름이 없는 함수, anonymous function )이라고 불리기도 합니다.
* 함수와 메소드의 근본적인 차이:
  * 근본적으로는 동일하지만 함수는 일반적인 용어이고 메소드는 객체지향적 용어입니다.
  * ***함수는 클래스에 독립적***이고, ***메소드는 클래스에 종속적***입니다.

## 람다식 작성하기

> I-① 메소드의 이름과 반환타입을 제거하고 ' -> ' 를 블록{} 앞에 추가해줍니다.  
> 람다식 변환 전
```java
int max(int a, int b) {
  return a > b ? a : b;
}
```
> I-② 람다식 변환 후
```java
(int a, int b) -> {
  return a > b ? a : b;
}
```

> I-③ 반환값이 있는 경우, 식이나 값만 적고 return문 생략 가능(끝에 ';' 안붙임)
```java
(int a, int b) -> a > b ? a : b
```
> I-④ 매개변수의 타입이 추론 가능하면 생략 가능(대부분의 경우 생략 가능)
```java
(a, b) -> a > b ? a : b
```

## 람다식 작성하기 주의사항
>1. 매개변수가 하나인 경우, 괄호 생략 가능(type이 없을 때만 가능)
* 코드 예시
```java
(a) -> a * a
a -> a * a      // OK

(int a) -> a * a
int a -> a * a  // ERROR : type이 있으므로 괄호 생략 불가능
```
>2. 블록 안의 문장이 하나밖에 없을 때, 괄호 생략 가능(끝에 ; 안붙임)
* 코드 예시
```java
(int i) -> { System.out.println(i); } // 
(int i) -> System.out.println(i)      // OK
```
* 코드 생략가능
```java
(int i) -> System.out.println(i)
```
>3. 단 하나뿐인 문장이 return문이면 괄호{} 생략 불가
* 코드 예시
```java
(int a, int b) -> { return a > b ? a : b; } // OK
(int a, int b) -> return a > b ? a : b      // ERROR
```

## 람다식 예시

| 메소드 | 람다식 |
| :--: | :--: |
| int max(int a, int b) {  return a > b ? a : b;  }  | (a, b) -> a > b ? a : b |
| int printVar(String name, int i) { System.out.println(name+"="+i); } | (name, i) -> System.out.println() |
| int square(int x) { return x * x; } | x -> x * x |
| int roll() { return (int) (Math.random()*6); } | () -> (int)(Math.random*6) |


##공부에 참고한 사이트
> [남궁성의 정석코딩](https://www.youtube.com/watch?v=3wnmgM4qK30)
