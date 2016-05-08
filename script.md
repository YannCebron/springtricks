40 Tips & Tricks for Spring in IntelliJ IDEA

## Preparation
Use IntelliJ IDEA 2016.2 (EAP).
Use Presentation Mode, check font size (File | Settings | Appearance & Behavior | Appearance).
Adjust Documentation Font Size in Spring toolwindow.



## General/Navigation

### Spring Facet/Contexts
Open Project. Notice "Spring Configuration Check" notification.
Explain necessity to setup contexts. Use "Create Default Context" for simple apps (unless
auto-configured context should be used (SB/MVC).

Open MainConfiguration, apply "Create Spring Facet", gutter icons etc. start working.
Open Test, no need for setup.

Mention "parent context" (used in Spring MVC automatically) and possibility to
have recursive parent relationship.

Open "Spring Models Diagram" to visualize the full context graph.
In `importedXml.xml`: uncomment 2nd `<component-scan>` to visualize cycle detection.

### Code: Navigating the context
Open MainConfiguration. Demonstrate `@ComponentScan` gutter and code insight on @ImportXX annotations.
Uncomment `@MyComponentScan` and demonstrate `@AliasFor` support.

"File | Settings | Editor | General | Gutter Icons" can be used to customize.


### Spring Toolwindow
Demonstrate basic functionality. Toggle implicit/infrastructure (`@ComponentScan`/`<component-scan>`) beans.
Demonstrate *Alt+F1* from `@Bean` to select in tool window.



## Working with Code

### @Autowiring and @Profile
Choose Active Profile "mainProfile".
`MainConfiguration#autowiredLongBean`: demonstrate "Add @Qualifier" quickfix.
Demonstrate "Convert to CTOR parameter" quickfix and explain motivation.

Activate "@Profile("customProfile")" and make it active in IDE. Existing `@Qualifier` becomes invalid, remove it.
No more autowiring error due to switch to `CustomProfileConfiguration`.



## Working with XML



## Spring Boot



## Spring MVC
