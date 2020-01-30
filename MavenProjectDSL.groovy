job('First Jenins Job')
{
    description("First Maven Job ")
    scm{
        git("https://github.com/Abhishek08/devops.git", 'master')
    }
    steps{
        maven('clean package', 'pom.xml')
    }
    publishers {
        //archive the war file generated
        archiveArtifacts '**/*.war'
    }
}
