package com.github.catvod.spider.merge.p060v;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.v.y */
/* loaded from: classes.dex */
public final class C0742y extends AbstractRunnableC0707L<Object> {

    /* renamed from: c */
    private final Executor f1376c;

    /* renamed from: d */
    final /* synthetic */ C0743z f1377d;

    /* renamed from: e */
    private final Callable<Object> f1378e;

    /* renamed from: f */
    final /* synthetic */ C0743z f1379f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Incorrect types in method signature: (Ljava/util/concurrent/Callable<Ljava/lang/Object;>;Ljava/util/concurrent/Executor;)V */
    public C0742y(C0743z c0743z, Callable callable) {
        EnumC0696A enumC0696A = EnumC0696A.f1312a;
        this.f1379f = c0743z;
        this.f1377d = c0743z;
        this.f1376c = enumC0696A;
        this.f1378e = callable;
    }

    @Override // com.github.catvod.spider.merge.p060v.AbstractRunnableC0707L
    /* renamed from: a */
    final void mo28a(Throwable th) {
        C0743z c0743z;
        this.f1377d.f1380p = null;
        if (th instanceof ExecutionException) {
            c0743z = this.f1377d;
            th = ((ExecutionException) th).getCause();
        } else if (th instanceof CancellationException) {
            this.f1377d.cancel(false);
            return;
        } else {
            c0743z = this.f1377d;
        }
        c0743z.mo46u(th);
    }

    @Override // com.github.catvod.spider.merge.p060v.AbstractRunnableC0707L
    /* renamed from: b */
    final void mo27b(Object obj) {
        this.f1377d.f1380p = null;
        this.f1379f.mo47t(obj);
    }

    @Override // com.github.catvod.spider.merge.p060v.AbstractRunnableC0707L
    /* renamed from: d */
    final boolean mo26d() {
        return this.f1377d.isDone();
    }

    @Override // com.github.catvod.spider.merge.p060v.AbstractRunnableC0707L
    /* renamed from: e */
    final Object mo25e() {
        return this.f1378e.call();
    }

    @Override // com.github.catvod.spider.merge.p060v.AbstractRunnableC0707L
    /* renamed from: f */
    final String mo24f() {
        return this.f1378e.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final void m23h() {
        try {
            this.f1376c.execute(this);
        } catch (RejectedExecutionException e) {
            this.f1377d.mo46u(e);
        }
    }
}
