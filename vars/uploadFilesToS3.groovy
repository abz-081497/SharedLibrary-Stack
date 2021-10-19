def call(Map stageParams = [Region: "us-east-1",  bucketName: "test-cf-bucket-abigael", s3Path: ""]) {
    withAWS(region: "${AWS_REGION}", credentials:'awscredentials') {
        awsIdentity()
        s3Upload( 
            workingDir: stageParams.workingDir,
            includePathPattern: stageParams.stackFileName,
            bucket: stageParams.bucketName,
            path: stageParams.s3Path
        )
    }
}
