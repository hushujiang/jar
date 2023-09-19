package com.github.catvod.spider.merge.p060v;

import com.github.catvod.spider.merge.atm;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.v.L */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC0707L<T> extends AtomicReference<Runnable> implements Runnable {

    /* renamed from: a */
    private static final Runnable f1319a = new RunnableC0706K();

    /* renamed from: b */
    private static final Runnable f1320b = new RunnableC0706K();

    /* renamed from: g */
    private void m74g(Thread thread) {
        Runnable runnable = get();
        RunnableC0705J runnableC0705J = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof RunnableC0705J;
            if (!z2 && runnable != f1320b) {
                break;
            }
            if (z2) {
                runnableC0705J = (RunnableC0705J) runnable;
            }
            i++;
            if (i > 1000) {
                Runnable runnable2 = f1320b;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z = Thread.interrupted() || z;
                    LockSupport.park(runnableC0705J);
                }
            } else {
                Thread.yield();
            }
            runnable = get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    /* renamed from: a */
    abstract void mo28a(Throwable th);

    /* renamed from: b */
    abstract void mo27b(T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m75c() {
        Runnable runnable = get();
        if (runnable instanceof Thread) {
            RunnableC0705J runnableC0705J = new RunnableC0705J(this, null);
            RunnableC0705J.m76a(runnableC0705J, Thread.currentThread());
            if (compareAndSet(runnable, runnableC0705J)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (getAndSet(f1319a) == f1320b) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    abstract boolean mo26d();

    /* renamed from: e */
    abstract T mo25e();

    /* renamed from: f */
    abstract String mo24f();

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        T t = null;
        if (compareAndSet(null, currentThread)) {
            boolean z = !mo26d();
            if (z) {
                try {
                    t = mo25e();
                } catch (Throwable th) {
                    if (!compareAndSet(currentThread, f1319a)) {
                        m74g(currentThread);
                    }
                    if (z) {
                        mo28a(th);
                        return;
                    }
                    return;
                }
            }
            if (!compareAndSet(currentThread, f1319a)) {
                m74g(currentThread);
            }
            if (z) {
                mo27b(t);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String m897d;
        Runnable runnable = get();
        if (runnable == f1319a) {
            m897d = atm.m897d("180F141B25360D47213103162F27");
        } else if (runnable instanceof RunnableC0705J) {
            m897d = atm.m897d("180F141B25360D47213C020C2F2828201C0C2F3E27");
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 21);
            sb.append(atm.m897d("180F141B25360D4721271916243334326C17245A"));
            sb.append(name);
            sb.append(atm.m897d("37"));
            m897d = sb.toString();
        } else {
            m897d = atm.m897d("180F141B25360D47213B030C4A292E341E0C2F3E5A2C090C37");
        }
        String mo24f = mo24f();
        StringBuilder sb2 = new StringBuilder(String.valueOf(mo24f).length() + String.valueOf(m897d).length() + 2);
        sb2.append(m897d);
        sb2.append(atm.m897d("465A"));
        sb2.append(mo24f);
        return sb2.toString();
    }
}
