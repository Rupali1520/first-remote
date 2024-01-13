def call(){
    sh 'mvn clean'
    sh 'mvn test'
}
