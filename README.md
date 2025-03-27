<div align="center">
    <img src="https://capsule-render.vercel.app/api?type=wave&color=D1E7FF&height=180&text=Employee%20System&animation=&fontColor=3B3B3B&fontSize=70" />
</div>



<div align="left">
    <h2 style="border-bottom: 1px solid #d8dee4; color: #282d33;"> 프로젝트 소개 </h2>
    <div style="font-weight: 700; font-size: 15px; text-align: center; color: #282d33;">
        <h3> Employee System </h3>
        <p>이 시스템은 사원 정보를 효율적으로 관리하는 도구로, 사원의 정보, 급여 , 부서 등을 손쉽게 처리할 수 있는 CLI기반 프로그램입니다.
    </div>
</div> <br>



<div align="left">
    <h2 style="border-bottom: 1px solid #d8dee4; color: #282d33;"> 🎯 주요 기능 </h2>
    <div style="font-weight: 700; font-size: 15px; text-align: center; color: #282d33;">
         <strong>사원 관리 :</strong>  직원정보와 관련된 기능  add / deldete / update / search / sort  <br>
            <strong>급여 관리 :</strong> 급여와 관련된 기능  급여 / 연봉인상 / 성과등급 / 보너스 / 오버타임 <br>
            <strong>부서 관리 :</strong> 부서와 관련된 기능  add / deldete / update<br>
            <strong>Backup:</strong> 모든  table에  발생한 event를 기록</div> <br>
        <p>이 시스템은 사원 정보의 관리와 관련된 다양한 기능을 제공하며, 여러 명의 사원을 동시에 관리할 수 있어 실무 환경에서 매우 유용하게 활용될 수 있습니다.</p>
    </div> 
</div>

<div align="left">
    <h2 style="border-bottom: 1px solid #d8dee4; color: #282d33;"> 👥 팀원 소개 </h2>
    <div style="font-weight: 700; font-size: 15px; text-align: center; color: #282d33;">
        <p>강창선 <a href="https://github.com/KangChangSeon" target="_blank">#KangChangSeon</a> - 팀장 | LOGIN SYSTEM / EMPLOYEES / DEPARTMEN</p>
        <p>고윤아 <a href="https://github.com/kya9505" target="_blank">#kya9505</a> - EMPLOYEES / BACKUP </p>
        <p>정명채 <a href="https://github.com/jyngmyungchae" target="_blank">#jyngmyungchae</a> - SALARY / REFEACTOR </p> 
        <p>정난희 <a href="https://github.com/Eveieve" target="_blank">#Eveieve</a> -  SALARY / BACKUP </p>
    </div>
</div> <br>
<div align="left">
    <h2 style="border-bottom: 1px solid #d8dee4; color: #282d33;"> 📁 프로젝트 폴더 구조 </h2>
</div>

```plaintext
/Prokin-Donuts
│── .github
│── .idea
│── out
│── src
│   ├── cli         
│   │   ├── controller             # 컨트롤러 계층
│   │   │   ├── BackupController   # 공통 기능 모음 (각 도메인별 폴더 포함)
│   │   │   ├── BaseController
│   │   │   ├── DepartmentController
│   │   │   ├── EmployeeController
│   │   │   ├── MainController
│   │   │   ├── SalaryController
│   ├── config           
│   │   ├── dbinfo.properties      # 설정 관련 (DB 설정 등)
│   │   ├── DBConnectionManager
│   ├── dao
│   ├── docs  
│   ├── dto                        # DTO (Data Transfer Object)            
│   ├── service                    # 서비스 계층 (비즈니스 로직)
│   ├── util                       # 유틸리티 클래스 모음
│   │   ├── salarycalculator
│   │   ├── vaildation
│   │   ├── DButil
```

<div align="left">
    <h2 style="border-bottom: 1px solid #d8dee4; color: #282d33;"> 🎮 실행 방법 </h2>
    <div style="font-weight: 700; font-size: 15px; text-align: center; color: #282d33;">
        1️⃣ Java 17+ & MySQL 설치<br>
        2️⃣ hr-finder폴더의 BackupTrigger.SQL, DepartmentTrigger.SQL, procedure.sql 파일 실행  <br>
        3️⃣ 프로그램 실행<br>
        mvn compile exec:java -Dexec.mainClass="com.hr-finder.Main"<br>
        4️⃣ CLI 메뉴 선택 <br><br>
   Please enter your employee ID : 100 <br>
Please enter your Password : 1234 <br>
Administrator login successful<br>
========== Main Menu ==========<br>
1. Departments<br>
2. Employees<br>
3. Salary<br>
4. Backup<br>
5. Exit<br>
Select an option: _<br>
    </div>
</div> <br>
<div align="left">
    <h2 style="border-bottom: 1px solid #d8dee4; color: #282d33;"> 👥 권한에 따른 메뉴 </h2>
    <div style="font-weight: 700; font-size: 15px; text-align: center; color: #282d33;">
        <p><strong>관리자:</strong> 부서관리/ 사원관리 / 급여관리 / 백업테이블 조회 등의 기능을 사용할 수 있습니다. </p>
        <p><strong>일반 사원 :</strong> 본인의 정보 ,급여 정보 등을 확인할 수 있습니다. </p>
    </div>
</div> <br>

<div align="left">
    <h2 style="border-bottom: 1px solid #d8dee4; color: #282d33;"> 🛠️ Tech Stacks </h2>
    <div style="margin: 0 auto; text-align: center;">
        <img src="https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=Java&logoColor=white">
        <img src="https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=Git&logoColor=white">
        <img src="https://img.shields.io/badge/Github-181717?style=for-the-badge&logo=Github&logoColor=white">
        <img src="https://img.shields.io/badge/Notion-000000?style=for-the-badge&logo=Notion&logoColor=white">
        <img src="https://img.shields.io/badge/Slack-4A154B?style=for-the-badge&logo=Slack&logoColor=white">
    </div>
</div>
<div align="left">
    <h2 style="border-bottom: 2px solid #4CAF50; color: #333; font-size: 24px; padding-bottom: 10px;">
        👥 기여 방법 (팀원 전용)
    </h2>
    <div style="font-weight: 600; font-size: 16px; text-align: left; color: #333; line-height: 1.6; background-color: #f4f4f4; padding: 20px; border-radius: 8px;">
        이 프로젝트는 팀원들만 기여할 수 있습니다.<br><br>
        <ul style="padding-left: 20px;">
            <li><strong>1.</strong> 기능 추가 전 팀원과 논의</li>
            <li><strong>2.</strong> <code>feature/기능명</code> 브랜치 생성 후 개발</li>
            <li><strong>3.</strong> <code>dev</code> 브랜치로 PR 후 코드 리뷰</li>
            <li><strong>4.</strong> 승인되면 <code>main</code> 브랜치에 병합</li>
            <li><strong>5.</strong> 커밋 메시지 형식:
                <ul style="padding-left: 20px;">
                    <li><code>[feat] 기능 추가</code></li>
                    <li><code>[fix] 오류 수정</code></li>
                </ul>
            </li>
        </ul>
    </div>
</div>


<div align="left">
    <h2 style="border-bottom: 1px solid #d8dee4; color: #282d33;"> 📜 라이선스 </h2>
    <div style="font-weight: 700; font-size: 15px; text-align: center; color: #282d33;">
        🔒 팀원 전용 프로젝트입니다. 외부 사용은 제한됩니다.
    </div>
</div> <br>


<div align="left">>
    <h2 style="border-bottom: 1px solid #d8dee4; color: #282d33;"> 🧑‍💻 Contact me </h2>
    <p>문의 사항이 있으시면 언제든지 연락 주세요!</p>
</div>
