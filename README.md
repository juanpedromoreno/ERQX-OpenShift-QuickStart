Running on OpenShift
--------------------

Create an account at https://www.openshift.com

Install the RHC client tools if you have not already done so:

```
>sudo gem install rhc
>rhc setup
```

Create a python application

```
>rhc app create myERQXApp http://cartreflect-claytondev.rhcloud.com/reflect?github=tyrcho/openshift-cartridge-play2 GIT_REPO_BLOG={your-git-repo-blog-backend}
```

Add this upstream repo

```
>cd myerqxApp
>git remote add upstream -m master https://github.com/47deg/ERQX-OpenShift-QuickStart.git
>git pull -s theirs upstream master
```

Then push the repo upstream

```
>git push origin master
```

That's it. You can now checkout your application at:

http://myERQXApp-$yournamespace.rhcloud.com
