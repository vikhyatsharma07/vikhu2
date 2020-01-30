job('First Jenins Job')
{
    description("First Maven Job ")
    scm{
        git("https://github.com/Abhishek08/devops.git")
    }
    steps{
        maven('clean package', 'pom.xml')
    }
    publishers {
        //archive the war file generated
        archiveArtifacts '**/*.war'
    }
}
