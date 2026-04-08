# 202230211 문희원

## 1주차
- Repositroy(저장소)
    - 파일을 관리하기 위한 단위 = 폴더
- Remote repository(서버 저장소)
- Branch(브랜치, 가지)
    - 독립적인 작업 공간을 제공하여 여러 개발자들이 동시에, 또는 특정 기능이나 버그수정과 같이 서로 다른 작업을 병렬적으로 진행하도록 돕는 기능
- Default Branch(기본 브랜치, 기둥)
    - =master
    - =Main

---

Git 설치 방법

1. Git 접속
2. Install window 클릭
3. Git for windows /x64 set 클릭
4. 실행 후 5번째 페이지에서 main으로 선택 후 설치

---

- 깃 사전
    - Pro git

---

깃 명령어

```jsx
#사용자 등록
git config --global user.name "Your name"
git config --global user.email "your-email@example.com"

git init #새로운 git 저장소 만들기
git add #변경된 모든 파일을 staging
git commit -m"설명" #commit 하기
git log --oneline #commit 기록 확인
```
