freeStyleJob('example') {
    
    scm {
        git('https://github.com/Tejeshwarraju/com.mybank.online.git', 'master')
    }
  
    steps {
        steps {
        shell('python script.py')
    }
    }
   
}
