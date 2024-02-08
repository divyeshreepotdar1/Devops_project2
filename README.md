
**Introduction:**
This document outlines the comprehensive steps taken to complete Homework Assignment 3, which involves the creation of a microservices-based application using Spring Boot, RESTful Web Services, JPA/Hibernate, and ReactJS. The application is further integrated with Amazon RDS/MySQL for CRUD operations, containerized using Docker, and deployed on Kubernetes.

**Steps:**

1. **Creating Amazon RDS Database:**
   - Selected RDS with the MySQL engine and Free tier option.
   - Set master username/password and allocated 20GB storage.
   - Configured connectivity with public access set to 'Yes'.
   - Monitored the dashboard until the status displayed as 'Available'.

2. **Installing Maven on EC2 Instance:**
   - Connected to the Jenkins-installed EC2 instance.
   - Installed Maven using `sudo apt install maven`.
   - Verified the installation with `mvn –version`.

3. **Configuring Maven on Jenkins:**
   - Configured Maven's home path on Jenkins by navigating to Manage Jenkins > Global Tools Configuration > Add Maven.
   - Specified Maven version and home path, saving the configuration.

4. **Plugin Configuration:**
   - Checked and enabled Jenkins Plugins by accessing the Jenkins dashboard and navigating to Manage Jenkins > Plugin Manager.
   - Verified and activated the required plugins under Installed Plugins.

5. **Backend Development:**
   - Developed POST and GET APIs using Spring Tool Suite, adhering to a standard design pattern.
   - Integrated the Amazon RDS instance endpoint into the application.properties file for seamless functionality.

6. **Testing APIs using POSTMAN:**
   - Tested data retrieval by sending a request to /form/viewAllRecords endpoint using Postman.
   - Verified data submission by executing a request to the /form/submit endpoint, checking for a 200 OK response status.

7. **Integration with ReactJS:**
   - Incorporated ReactJS for the frontend development, ensuring a responsive and user-friendly interface.

8. **Integration with Rancher:**
   - Generated an API Token on Rancher by accessing the Rancher dashboard, navigating to the user profile section, and selecting "Account and API Keys."
   - Created an API token with a specified expiry date.

**Conclusion:**
This readme provides a comprehensive guide to the successful development, testing, and deployment of a microservices-based application, emphasizing the integration of Amazon RDS, Jenkins, ReactJS, and Rancher for a streamlined and efficient workflow.
