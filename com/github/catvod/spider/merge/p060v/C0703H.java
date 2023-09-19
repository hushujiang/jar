package com.github.catvod.spider.merge.p060v;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p056r.C0671s;
import com.github.catvod.spider.merge.p057s.AbstractC0679f;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.github.catvod.spider.merge.v.H */
/* loaded from: classes.dex */
public final class C0703H {
    /* renamed from: a */
    public static void m82a(InterfaceFutureC0708M interfaceFutureC0708M, InterfaceC0700E interfaceC0700E, Executor executor) {
        interfaceFutureC0708M.mo62a(new RunnableC0701F(interfaceFutureC0708M, interfaceC0700E), executor);
    }

    /* renamed from: b */
    public static Executor m81b() {
        return EnumC0696A.f1312a;
    }

    /* renamed from: c */
    public static Object m80c(Future future) {
        if (future.isDone()) {
            return C0717W.m72a(future);
        }
        throw new IllegalStateException(C0671s.m113b(atm.m897d("2C0F0E003E3D4A0D1B066C3D120A1F16383D0E5A0E1A6C3A0F5A1E1A223D505A5F06"), future));
    }

    /* renamed from: d */
    public static InterfaceFutureC0708M m79d(Throwable th) {
        return new C0704I(th);
    }

    /* renamed from: e */
    public static InterfaceExecutorServiceC0709N m78e(ExecutorService executorService) {
        if (executorService instanceof InterfaceExecutorServiceC0709N) {
            return (InterfaceExecutorServiceC0709N) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new ScheduledExecutorServiceC0713S((ScheduledExecutorService) executorService) : new C0710O(executorService);
    }

    @SafeVarargs
    /* renamed from: f */
    public static C0702G m77f(InterfaceFutureC0708M... interfaceFutureC0708MArr) {
        return new C0702G(AbstractC0679f.m111f(interfaceFutureC0708MArr));
    }
}
