# automation-test-ppl-week-8

This is the repository for maintaining the calculator application to be used in testing phase using white-box approach. You may clone this repository at your respective folder on your laptop.

```bash
git clone https://github.com/rachmatpurwasaputra/calculator-testing.git
```

To push your change, do these steps mentioned below:
> Important to tell: After you've got yourself this repository on your laptop, make sure to always run `git pull` command first whenever you want to push your change
<br/>

1. Add the file that has been changed by you using this syntax:
    ```bash
    git add <file-name-that-has-been-changed>
    ```
2. Commit the added file, with short yet meaningful message after `-m` directive:
    ```bash
    git commit -m "meaningful message about the change you have made"
    ```
3. Then, push yout commit to this repository, using this syntax:
   ```bash
   git push
   ```
   > <b>NOTE</b>: Make sure you are pushing towards the `main` branch, NOT to the `master` branch. In case yout local branch on your computer/laptop are having master branch, please change it to the main first.

The project itself using VS Code (denoted by `.vscode` folder). We encourage you to use the same editor. Start viewing and editing the code from the `/calculator` folder

To install all dependencies (make sure you are in `/calculator` folder so CLI can read `pom.xml`):

```bash
mvn install
```

## Structure of /calculator/src/main/java directory
Within there should be four main classes, namely:
1. Main.java
2. Calculation.java
3. Operator.java
4. Validation.java

## How to test
Run this command within your terminal/CLI (make sure you are currently in /calculator folder) :
```bash
mvn test
```

## Attribution
This repository is maintained by Kelompok B1 Kelas 3B DIV-Teknik Informatika Politeknik Negeri Bandung.
