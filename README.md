# 如何使用Jenkins共享库

## 编写共享库代码

## 在Jenkins中添加共享库

`Manage Jenkins` ---> `System` --> `Global Pipeline Libraries`

- Default version: 选择对应的共享库分支名即可

<img width="1698" alt="image" src="https://github.com/velkoz1108/my-jenkins-shared-library/assets/22334129/ea19866e-746d-41d2-85ab-932d70f1eb60">

## 在pipeline中使用共享库

`my-shared-library`这个名字必须要与上面填写的名称一致，否则无法加载共享库

```groovy
@Library('my-shared-library') _
example('Jenkins User')

def bar = new org.foo.Bar(this)
bar.sayHello('Jenkins User')

s3Upload()

s3Upload("/tmp/test")


s3Upload("/tmp/test/",'s3://tmp-bucket/test/')
```

<img width="1215" alt="image" src="https://github.com/velkoz1108/my-jenkins-shared-library/assets/22334129/9e26c756-1373-4c27-bc58-59ae8761c16a">

