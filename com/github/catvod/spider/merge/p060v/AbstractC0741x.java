package com.github.catvod.spider.merge.p060v;

import com.github.catvod.spider.merge.atm;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.v.x */
/* loaded from: classes.dex */
public abstract class AbstractC0741x<OutputT> extends AbstractC0727j<OutputT> {

    /* renamed from: j */
    private static final AbstractC0718a f1372j;

    /* renamed from: k */
    private static final Logger f1373k = Logger.getLogger(AbstractC0741x.class.getName());

    /* renamed from: h */
    private volatile Set<Throwable> f1374h = null;

    /* renamed from: i */
    private volatile int f1375i;

    static {
        Throwable th;
        AbstractC0718a c0740w;
        try {
            c0740w = new C0739v(AtomicReferenceFieldUpdater.newUpdater(AbstractC0741x.class, Set.class, atm.m897d("02")), AtomicIntegerFieldUpdater.newUpdater(AbstractC0741x.class, atm.m897d("03")));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            c0740w = new C0740w();
        }
        f1372j = c0740w;
        if (th != null) {
            f1373k.log(Level.SEVERE, atm.m897d("391B1C100D2C05171316043D060A1F076C31195A180723330F145B"), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0741x(int i) {
        this.f1375i = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public static /* synthetic */ int m30y(AbstractC0741x abstractC0741x) {
        int i = abstractC0741x.f1375i - 1;
        abstractC0741x.f1375i = i;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public final void m35A() {
        this.f1374h = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public final int m34B() {
        return f1372j.mo36e(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public final Set<Throwable> m33C() {
        Set<Throwable> set = this.f1374h;
        if (set == null) {
            Set<Throwable> newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            mo29z(newSetFromMap);
            f1372j.mo37d(this, newSetFromMap);
            Set<Throwable> set2 = this.f1374h;
            set2.getClass();
            return set2;
        }
        return set;
    }

    /* renamed from: z */
    abstract void mo29z(Set<Throwable> set);
}
