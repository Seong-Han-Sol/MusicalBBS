#### JDK 설치 및 환경 변수 설정

스프링은 버전에 따라 JDK의 제한이 있다.

스프링 5 버전은 JDK 1.8이상 (JDK 1.8은 JAVA 8이랑 동일하다.)

스프링 4 버전은 JDK 1.6이상을 권장한다.

스프링 부트는 JAVA 11을 주로 사용하는 추세이다.



사용하려는 스프링 버전에 맞춰서 JDK를 설치하고

윈도우10의 경우 환경 변수 설정을 해주도록 한다.



##### JDK 설치 주소

https://www.oracle.com/java/technologies/downloads/



##### JDK 기본 설치 경로

"C:\Program Files\Java"



##### 시스템 변수

변수 이름: JAVA_HOME

변수 값: JDK 경로 `(C:\Program Files\Java)`

##### 시스템 변수 Path에 추가하기

%JAVA_HOME%\bin



#### 자바 환경 변수 설정 연습문제

1. 시스템 변수에 변수명은 `JAVA_HOME`, 값은 `JDK 1.8 경로`를 설정해서 추가한다.
2. 시스템 변수 `Path`에 `%JAVA_HOME%\bin` 을 추가한다.
3. 설정 후 명령 프롬포트에서 javac 명령어가 제대로 동작하는지 확인한다.



#### STS(Spring Tool Suite) 설치

STS는 자체적으로 이클립스 위에 스프링 관련 기능이 추가되어 있어 별도의 설정을 하지 않아도 스프링을 이용한 개발이 가능하기 때문에 편리하다.



##### STS 4 설치 URL

https://spring.io/tools

STS는 이클립스와 특별히 다르지 않고 이클립스 IDE에 스프링 설정이 기본적으로 되어 있다고 생각하면 된다.

STS 3버전은 스프링 레거시 프로젝트가 기본 설정이지만, STS 4 버전은 스프링 부트가 기본 설정이므로 스프링 레거시 프로젝트를 생성하기 위해서는 추가적인 플러그인 설치가 필요하다.

설치 완료 후 추가로 "Spring Tools 3 Add-On for Spring Tools 4" 플러그인과

"Eclipse Enterprise Java and Web Developer Tools 3.23" 를 설치해 주도록 한다.

`*플러그인 설치는 STS에서 상단 탭메뉴의 "help"에서 마켓 플레이스를 들어가면 된다.`



**Spring Tools 3 Add-On for Spring Tools 4**: STS4는 기본적으로 프로젝트 생성에 레거시 프로젝트 항목이 없다. 해당 플러그인을 설치해줘야 레거시 프로젝트 항목이 생긴다.

**Eclipse Enterprise Java and Web Developer Tools 3.23**: 기본적으로 웹 관련 설정과 Run on Server 항목이 없다. 이를 위해서 플러그인을 설치한다.



플러그인 설치완료 후 Open Perspective에서 Spring으로 변경해 줘야

프로젝트 생성에 레거시 프로젝트 항목이 생긴다.



##### STS.ini 설정

https://devhj.tistory.com/3

보통은 이클립스에서 사용할 JDK를 설정하는 `-vm` 정도의 설정과 

이클립스에서 사용할 최소 JDK 버전을 설정하는

`Dosgi.requiredJavaVersion` 설정 정도만 사용하며 필요에 따라 추가해주면 된다.



##### STS UTF-8 한글 인코딩 설정

이클립스 설정에 들어가서 WORKSPACE , HTML, CSS, JSP의 인코딩을 UTF-8로 설정한다.



#### 톰캣(Tomcat) 설치

JDK 1.8을 설치했다면 Tomcat 9.0버전을 설치하는것을 권장한다.

Core의 zip 파일을 다운로드 받아 압축을 해제하면 된다.

https://tomcat.apache.org/download-90.cgi



#### 프로젝트 생성 연습문제

1. spring-practice01 이름의 레거시 프로젝트를 생성한다.
2. 컨텍스트 패스는 `/`로 지정한다.
3. home.jsp 한글 설정을 추가한다.
4. pom.xml에서 스프링을 5버전으로 변경한다.
5. pom.xml에서 JDK를 1.8로 변경한다.



#### JSP 한글 인코딩 설정





#### Maven Repository

스프링 프로젝트를 진행하면서 필요한 라이브러리는 Maven Repository에서 검색해서

pom.xml에 추가하면 된다. 추가후에는 프로젝트 우클릭 후 Maven을 선택하고

Update project을 선택 후 Offline 체크를 해제하고 OK를 눌러주면 된다.

https://mvnrepository.com/



스프링 레거시 프로젝트를 생성 후 기본적으로

스프링 버전을 5로 변경해 주고 자바를 1.8로 변경해 준다.



#### Lombok 라이브러리 설치

Lombok은 Getter/Setter, toString(), 생성자 등을 애노테이션만 추가해주면

컴파일 시점에 자동으로 생성해주는 편리한 라이브러리다.

1) https://projectlombok.org/download

설치 완료 후 STS가 설치되어 있는 경로를 설정해주고 Install을 클릭하면 된다.

2) Maven Repository 에서 lombok을 검색하고 의존성을 pom.xml에 추가해 주면 된다.



`참고) lombok 공식사이트에서 설치한 버전과 pom.xml에 추가하는 버전이 일치하는 것이 좋다.`

`버전이 다르면 오류가 발생하는 경우가 있다.`



##### 자주사용하는 lombok 애노테이션

@Data

@Getter

@Setter

@ToString

@NoArgsConstructor
@AllArgsConstructor



@Data 애노테이션을 사용하면

@Getter
@Setter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor 5개가 기본으로 추가된다.



#### 롬복 연습문제

1. Event 클래스를 작성한다.

2. Event는 이벤트 번호(id), 제목(title), 시작일(startTime), 종료일(endTime)이 존재한다.

3. 롬복으로 @Getter와 @Setter, @Builder를 추가하고 기본 생성자와, 모든 매개변수 생성자를 생성한다.

4. EventService 라는 클래스를 만들어서 getEvents() 메서드를 정의한다. 

5. 첫 번째 이벤트로 `번호:1, 제목:"스프링 MVC 스터디 1차", 시작일:"2021-10-09:13:00", `

   `종료일:2021-10-09:18:30"`을 속성값으로 가지는 이벤트를 set 메서드로 초기화해서 생성한다.

6. 두 번째 이벤트로 `번호:2, 제목:"스프링 MVC 스터디 2차", 시작:"2021-10-10:13:00"`

   `종료일:2021-10:10:18:30"`을 속성값으로 가지는 이벤트를 생성자로 초기화해서 생성한다.

7. 세 번째 이벤트로 `번호:3, 제목:"스프링 MVC 스터디 3차", 시작:"2021-10-11:13:00",`

   `종료일:2021-10:10:18:30"`을 속성값으로 가지는 이벤트를 EventBuilder로 초기화해서 생성한다.

8. 생성한 두 개의 이벤트를 List에 저장한다.

9. getEvents() 메서드에서 이벤트를 저장한 List를 반환한다.





#### Oracle 설치

##### Oracle 18 XE 설치

https://www.oracle.com/kr/downloads/

오라클 공식 사이트에서 XE 18버전을 설치해 주도록 한다.

XE는 Express Edition의 약자로 개인용으로 사용시 무료 라이센스이다.

`주의1) 설치 경로에 한글이 포함되면 안 된다.` 

`주의2) 설치시 비밀번호는 잊어먹지 않도록 적어두는 것이 좋다.`



##### SQL Developer 설치

https://www.oracle.com/tools/downloads/sqldev-downloads.html

사용자 이름: sys 아니면 system 둘중 하나

비밀번호는 Oracle 18 XE 설치시 설정한 비밀번호를 입력해서 접속해준다.



##### 계정 생성

```SQL
 -- CREATE USER 계정명 IDENTIFIED BY 비밀번호
 CREATE USER C##BOARD IDENTIFIED BY BOARD
 -- GRANT 권한 TO 계정명
 GRANT CONNECT, RESOURCE, DBA TO C##BOARD
```

12c 이상 버전부터는 계정 앞에 c##을 붙여줘야 한다.

C##을 포함해서 계정이 된다.

아이디는 대소문자를 구문하지 않지만,

비밀번호는 대소문자를 구분하므로 주의해야 한다.



##### 오라클 포트(PORT) 설정

```sql
-- 포트 조회
SELECT DBMS_XDB.GETHTTPPORT() FROM DUAL
-- 포트 변경
EXEC DBMS_XDB.SETHTTPPORT(9090)
```

Tomcat이 기본적으로 8080포트를 사용하므로 충돌나지 않도록

오라클의 포트를 9090으로 변경해 준다.



#### 스프링과 오라클 데이터베이스 연동

pom.xml에 OracleJDBC Driver인 Ojdbc8 을 추가해 줘야 한다.

```xml
<!-- https://mvnrepository.com/artifact/com.oracle.database.jdbc/ojdbc8 -->
<dependency>
    <groupId>com.oracle.database.jdbc</groupId>
    <artifactId>ojdbc8</artifactId>
    <version>21.1.0.0</version>
</dependency>
```



추가 후 JDBC가 제대로 동작하는지 테스트 코드를 작성해 준다.

```java
@Log4j
public class JDBCTest {

	private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String USER = "C##BOARD";
	private final String PASSWORD = "BOARD";
	
	@Test
	public void connect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			final Connection conn = 
					DriverManager.getConnection(URL, USER, PASSWORD);
			log.info("데이터베이스 연결에 성공했습니다.");
			log.info("conn = " + conn);
			
		} catch (ClassNotFoundException e) {
			log.info("데이터베이스 드라이버 로드를 실패했습니다.");
		} catch (SQLException e) {
			log.info("데이터베이스 연결에 실패했습니다.");
		}
	}
}
```



#### hikari connection pool 설정

pom.xml에 HikariCP 커넥션 풀을 추가해 준다.

```xml
<!-- https://mvnrepository.com/artifact/com.zaxxer/HikariCP -->
<dependency>
    <groupId>com.zaxxer</groupId>
    <artifactId>HikariCP</artifactId>
    <version>3.4.5</version>
</dependency>
```



root-context.xml에 HikariConfig 빈을 등록해주고 HikariDataSource에 hikariConfig 빈을 주입해 준다.

```xml
<bean id="hikariConfig" class="com.zaxxer.hikari.HikariConfig">
		<property name="driverClassName" 
                  value="oracle.jdbc.driver.OracleDriver" />
		<property name="jdbcUrl" value="jdbc:oracle:thin:@localhost:1521:xe" />
		<property name="username" value="C##BOARD" />
		<property name="password" value="BOARD" />
</bean>
	
<bean id="dataSource" class="com.zaxxer.hikari.HikariDataSource"
		destroy-method="close">
		<constructor-arg ref="hikariConfig" />
</bean>
```



테스트 코드를 작성하여 정상적으로 동작하는지 테스트한다.

```java
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class DataSourceTest {
	
	@Autowired
	private DataSource dataSource;
	
	@Test
	public void testConnection() {
		try {
			final Connection conn = dataSource.getConnection();
			log.info("conn = " + conn);
			
		} catch (Exception e) {
			log.info("예외발생: " + e.getStackTrace());
		}
	}
	
}
```



#### Mybatis 연동

추가예정


#### 종합 설정 연습문제

1. 프로젝트명 `spring-practice02` 로 새로운 스프링 레거시 프로젝트를 생성한다.
2. 스프링 버전을 5.* 버전으로 변경하고 JAVA 버전을 1.8로 변경한다.
3. Lombok 라이브러리를 추가하고 정상적으로 동작하는지 테스트 코드를 작성한다.
4. Ojdbc8(Oracle JDBC Driver)을 연동하고 정상적으로 동작하는지 테스트 코드를 작성한다.
5. hikariCP 커넥션 풀 라이브러리를 추가하고 정상적으로 동작하는지 테스트 코드를 작성한다
6. Mybatis 프레임워크를 연동하고 간단한 테스트 코드를 작성한다.

`주의1) Junit4 테스트시 SpringJUnit4ClassRunner.class가 임포트되지 않으면`

`spring-test 를 pom.xml에 추가해주면 된다.` 

`주의2) Junit4 테스트시 "JUnit - initializationError" 가 발생하면 프로젝트 우클릭 -> Build Path -> Add Library -> JUnit 선택 Next -> version 선택, Finish를 진행해주면 된다.`



#### 컨트롤러 간단 연습문제

1. 게시판 JSP 파일을 views/board 디렉토리에 모두 추가한다.

2. 아래 URL 설계에 맞춰서 Controller 를 작성한다. 

   (Controller 이름은 edu.coldrain.controller 패키지 밑에 BoardController)

   

| URI           | Method | 설명                 |
| ------------- | ------ | -------------------- |
| /board/list   | GET    | 게시글 목록 화면     |
| /board/detail | GET    | 게시글 상세보기 화면 |
| /board/modify | GET    | 게시글 수정 화면     |
| /board/write  | GET    | 게시글 작성 화면     |

