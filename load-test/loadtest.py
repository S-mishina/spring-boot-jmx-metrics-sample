from locust import HttpUser, between, task

class MyUser(HttpUser):
    wait_time = between(1,1)
    host = "http://localhost:8080"
    @task
    def my_task(self):
        self.client.get("/")
