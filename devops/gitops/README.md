# 🔀 GitOps & ArgoCD

Notes and hands-on exercises on **GitOps practices** and  
**declarative continuous delivery** using ArgoCD in Kubernetes environments.

## 🧠 Covered Topics

### **GitOps Fundamentals**
- Git as the single source of truth
- Declarative infrastructure & applications
- Pull-based deployments vs push-based CI/CD
- Reconciliation loops & drift detection

### **ArgoCD Core Concepts**
- Installation & architecture (API server, repo-server, application-controller)
- RBAC, OIDC, Dex & SSO integrations
- Managing secrets (SOPS, Vault, External Secrets Operator)

### **Application Management**
- Applications & ApplicationSets
- Kustomize & Helm support
- Sync strategies: automated, manual, pruning, self-heal
- Health checks & custom health assessment

### **Progressive Delivery**
- Canary releases
- Blue/Green deployments
- Rollbacks & automated rollouts

### **Observability & Operations**
- Prometheus metrics
- Grafana dashboards
- Audit logs & troubleshooting sync failures

## 📚 Sources

- [ArgoCD Official Documentation](https://argo-cd.readthedocs.io)
- [Descomplicando GitOps com ArgoCD - LINUXtips](https://linuxtips.io/treinamento/descomplicando-gitops-no-kubernetes-com-argocd)
