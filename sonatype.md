## Sonatype Fork of Cloudbees Zendesk Java Client

### Build and Install

Use install.sh to build into your local environment.

### Sonatype Development

Use the sonatype branch for sonatype specific customiaztion.

### Create rollup patch for Sonatype changes

git format-patch origin/master --stdout > sonatype-changes.patch

### Code Style

Using CONTRIBUTING.adoc as a guide, maintain Intellij IDEA code style in intellij-idea-cloudbees.xml

