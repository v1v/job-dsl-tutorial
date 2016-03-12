# 1. Build your Jenkins image
Example project for the tutorial at https://github.com/jenkinsci/job-dsl-plugin/wiki/Tutorial---Using-the-Jenkins-Job-DSL.

For details about the use cases demonstrated in this project, please read the wiki entry first.

```bash
docker build --rm=true -t jobdsl_tutorial .
```

# 2. Run your Jenkins containers locally
Once you have build your local image then run the container locally

```bash
docker run --name jobdsl_tutorial -p 8080:8080 -v `pwd`/fs:/var/jenkins_home jobdsl_tutorial
```

# 3. Run the seed job

[Tutorial - Using the Jenkins Job DSL - section 3](https://github.com/jenkinsci/job-dsl-plugin/wiki/Tutorial---Using-the-Jenkins-Job-DSL#3-run-the-seed-job-and-generate-the-new-jobs-from-the-script).

# Requirements
- [Docker](https://docs.docker.com/installation/)

# Further reading
- https://registry.hub.docker.com/_/jenkins/
- https://github.com/jenkinsci/job-dsl-plugin/wiki
