package helpers

class JobHelper {
    static void addMyFeature(def job) {
        job.with {
            description('Arbitrary feature')
        }
    }
}
