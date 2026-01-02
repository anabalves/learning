# ☁️ AWS Cloud & Infrastructure

Notes and hands-on studies on **AWS core services**, **cloud architecture**,  
**security**, **cost optimization**, and **data processing** - focused on real-world,  
practical scenarios used in DevOps, SysOps, SRE, backend and data engineering.

## 🧠 Covered Topics

## **1. AWS Fundamentals**
- Global infrastructure: Regions, AZs, Local Zones, Edge Locations  
- Shared Responsibility Model  
- Free Tier usage & account setup  
- Billing, cost allocation, budgets & alerts  
- IAM basics: users, groups, roles, MFA, access keys  
- Multi-account structure & AWS Organizations

## **2. Networking (VPC)**
- VPC, subnets (public/private)  
- Route tables, Internet Gateway, NAT Gateway  
- Security Groups & NACLs  
- IPv4 / IPv6  
- VPC Peering & VPN fundamentals  
- VPC Endpoints (Gateway & Interface)

## **3. Compute**

### **Amazon EC2**
- Instance families & use cases  
- AMIs, EBS volumes (gp2 → gp3), snapshots  
- SSH/RDP access, KeyPairs  
- Autoscaling Groups (ASG)  
- Elastic Load Balancers (ALB/NLB/CLB)

### **Containers**
- Amazon ECR (private registries)  
- Amazon ECS (Fargate & EC2 modes)

### **Serverless Compute**
- AWS Lambda basics  
- Event sources & triggers

## **4. Storage & Content Delivery**

### **Amazon S3**
- Buckets, folders, versioning, lifecycle policies  
- Storage classes (Standard, IA, Glacier…)  
- Encryption at rest & in transit  
- Static website hosting  
- Data transfer & cross-region replication

### **Amazon CloudFront**
- CDN distributions  
- Caching policies, origins, behaviors  
- HTTPS & certificate setup (ACM)

### **Snow Family**
- Snowball overview for large-scale data migration

## **5. Databases**
- **RDS** (MySQL, PostgreSQL, SQL Server, Oracle)  
- Backups, Multi-AZ & read replicas  
- **DynamoDB** basics  
- Connection patterns, IAM auth, best practices

## **6. Monitoring & Observability**
- Amazon CloudWatch:
  - Logs, metrics, dashboards  
  - Alarms & notifications  
- AWS SNS (notifications & pub/sub)  
- Health checks & troubleshooting

## **7. Security & Compliance**
- IAM advanced:
  - Permission boundaries  
  - Policies: identity-based, resource-based  
- IAM Identity Center (ex-SSO)  
- AWS Organizations policies:
  - SCP (Service Control Policies)  
  - Backup policies, Tag policies  
- Network security fundamentals  
- Security assessments with:
  - **Prowler**  
  - **Steampipe**  
- Encryption, KMS, secure-by-default practices  
- CloudFront + WAF basics

## **8. Cost Optimization (FinOps)**
- Cost Explorer & Billing Dashboard  
- Budget alerts & forecasting  
- Identifying idle/unused resources  
- Rightsizing (compute/storage)  
- Reserved Instances, Savings Plans & Spot Instances  
- Automations:
  - Stop/start scheduling for EC2  
  - gp2 → gp3 automation  
- Trusted Advisor cost recommendations  
- Best practices for tagging & cost allocation

## **9. Data Engineering on AWS – Glue**
- Glue Data Catalog fundamentals  
- Crawlers & schema discovery  
- Visual ETL (no-code flows)  
- ETL with Python scripts (read/transform/write with S3)  
- Workflows & Triggers  
- Integrations with S3 & Athena  
- Basic orchestration of data pipelines

## **10. Hands-On & Real Scenarios**
- Multi-tier architectures on AWS  
- High availability with ALB + ASG  
- HTTPS setup with ACM  
- DNS management with Route 53  
- Migrating workloads to AWS  
- Hosting static websites (S3 + CloudFront)  
- Deploying microservices (ECS/ECR)  
- Troubleshooting common networking issues:
  - DNS, routing, firewall, permissions  
- Building cost-efficient and secure cloud environments

## 📚 Sources

- [AWS Official Documentation](https://docs.aws.amazon.com)
- [Descomplicando AWS - LINUXtips](https://linuxtips.io/treinamento/descomplicando-aws)
- [AWS, na prática! - Phillipe Farias (Udemy)](https://www.udemy.com/course/aws-na-pratica/)
- [AWS Security Foundation - Phillipe Farias (Udemy)](https://www.udemy.com/course/aws-security-foundation/)
- [AWS com Cenários Reais - Gabriel Vilete (Udemy)](https://www.udemy.com/course/aws-do-zero-aprenda-nuvem-com-cenarios-reais/)
- [Computação em Nuvem Amazon AWS - Andre Iacono (Udemy)](https://www.udemy.com/course/amazon-aws-para-iniciantes/)
- [AWS: Essencial - Geek University (Udemy)](https://www.udemy.com/course/amazon-web-services-essencial/)
- [AWS para Iniciantes - Rogerio Guimaraes (Udemy)](https://www.udemy.com/course/aws-iniciantes-domine-a-nuvem-aws/)
- [Servidores Virtuais com EC2 na AWS - Andre Iacono (Udemy)](https://www.udemy.com/course/amazon-aws-criando-servidores-virtuais-com-ec2/)
- [AWS GLUE - Juracy Araujo de Almeida Junior (Udemy)](https://www.udemy.com/course/aprenda-aws-glue-na-pratica-processe-dados-na-cloud/)
- [FinOps na AWS - Pedro Nunes Guth (Udemy)](https://www.udemy.com/course/finops-na-aws-economizando-e-gerenciando-custos-na-nuvem/)
- [Amazon S3, CloudFront CDN e SnowBall - Andre Iacono (Udemy)](https://www.udemy.com/course/masterclass-aws-aprendendo-s3-cloudfront-e-snowball/)
- [Gerenciamento de Contas na AWS - Andre Iacono (Udemy)](https://www.udemy.com/course/amazon-aws-10-formas-de-economizar-ate-50-na-sua-conta)
