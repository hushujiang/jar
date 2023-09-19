package com.github.catvod.spider.merge.p060v;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p056r.C0665m;
import com.github.catvod.spider.merge.p057s.AbstractC0676c;
import com.github.catvod.spider.merge.p057s.AbstractC0686m;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.v.t */
/* loaded from: classes.dex */
public abstract class AbstractC0737t<InputT, OutputT> extends AbstractC0741x<OutputT> {

    /* renamed from: o */
    private static final Logger f1366o = Logger.getLogger(AbstractC0737t.class.getName());

    /* renamed from: l */
    private AbstractC0676c<? extends InterfaceFutureC0708M<? extends InputT>> f1367l;

    /* renamed from: m */
    private final boolean f1368m;

    /* renamed from: n */
    private final boolean f1369n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0737t(AbstractC0676c abstractC0676c) {
        super(abstractC0676c.size());
        this.f1367l = abstractC0676c;
        this.f1368m = false;
        this.f1369n = false;
    }

    /* renamed from: D */
    public static void m44D(AbstractC0737t abstractC0737t, InterfaceFutureC0708M interfaceFutureC0708M, int i) {
        abstractC0737t.getClass();
        try {
            if (interfaceFutureC0708M.isCancelled()) {
                abstractC0737t.f1367l = null;
                abstractC0737t.cancel(false);
            } else {
                try {
                    C0703H.m80c(interfaceFutureC0708M);
                    abstractC0737t.mo22F();
                } catch (ExecutionException e) {
                    th = e.getCause();
                    abstractC0737t.m41I(th);
                } catch (Throwable th) {
                    th = th;
                    abstractC0737t.m41I(th);
                }
            }
        } finally {
            abstractC0737t.m42G(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public void m42G(AbstractC0676c<? extends Future<? extends InputT>> abstractC0676c) {
        int m34B = m34B();
        C0665m.m123i(m34B >= 0, atm.m897d("261F09066C2C021B14557C78181F1714253603141D552A2D1E0F08103F"));
        if (m34B == 0) {
            if (abstractC0676c != null) {
                AbstractC0686m<? extends Future<? extends InputT>> it = abstractC0676c.iterator();
                while (it.hasNext()) {
                    Future<? extends InputT> next = it.next();
                    if (!next.isCancelled()) {
                        try {
                            C0703H.m80c(next);
                            mo22F();
                        } catch (ExecutionException e) {
                            th = e.getCause();
                            m41I(th);
                        } catch (Throwable th) {
                            th = th;
                            m41I(th);
                        }
                    }
                }
            }
            m35A();
            mo21H();
            mo20K(EnumC0736s.f1364b);
        }
    }

    /* renamed from: I */
    private void m41I(Throwable th) {
        boolean z;
        th.getClass();
        boolean z2 = this.f1368m;
        String m897d = atm.m897d("23140A0038782C0F0E003E3D4A1C1B1C203D0E5A0D1C38304A3F0807232A");
        String m897d2 = atm.m897d("2D150E552137181F5A012439045A151B297803140A0038782C0F0E003E3D4A1C1B1C202D181F545500370D1D131B2B780C1B1319392A0F095A142A2C0F085A01243D4A1C13073F2C");
        if (z2 && !mo46u(th)) {
            Set<Throwable> m33C = m33C();
            Throwable th2 = th;
            while (true) {
                if (th2 == null) {
                    z = true;
                    break;
                } else if (!m33C.add(th2)) {
                    z = false;
                    break;
                } else {
                    th2 = th2.getCause();
                }
            }
            if (z) {
                if (!(th instanceof Error)) {
                    m897d = m897d2;
                }
                f1366o.log(Level.SEVERE, m897d, th);
                return;
            }
        }
        boolean z3 = th instanceof Error;
        if (z3) {
            if (!z3) {
                m897d = m897d2;
            }
            f1366o.log(Level.SEVERE, m897d, th);
        }
    }

    /* renamed from: F */
    abstract void mo22F();

    /* renamed from: H */
    abstract void mo21H();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public final void m40J() {
        EnumC0696A enumC0696A = EnumC0696A.f1312a;
        this.f1367l.getClass();
        if (this.f1367l.isEmpty()) {
            mo21H();
        } else if (!this.f1368m) {
            final AbstractC0676c<? extends InterfaceFutureC0708M<? extends InputT>> abstractC0676c = this.f1369n ? this.f1367l : null;
            Runnable runnable = new Runnable() { // from class: com.github.catvod.spider.merge.v.q
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC0737t.this.m42G(abstractC0676c);
                }
            };
            AbstractC0686m<? extends InterfaceFutureC0708M<? extends InputT>> it = this.f1367l.iterator();
            while (it.hasNext()) {
                it.next().mo62a(runnable, enumC0696A);
            }
        } else {
            final int i = 0;
            AbstractC0686m<? extends InterfaceFutureC0708M<? extends InputT>> it2 = this.f1367l.iterator();
            while (it2.hasNext()) {
                final InterfaceFutureC0708M<? extends InputT> next = it2.next();
                next.mo62a(new Runnable() { // from class: com.github.catvod.spider.merge.v.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC0737t.m44D(AbstractC0737t.this, next, i);
                    }
                }, enumC0696A);
                i++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public void mo20K(EnumC0736s enumC0736s) {
        this.f1367l = null;
    }

    @Override // com.github.catvod.spider.merge.p060v.AbstractC0732o
    /* renamed from: k */
    protected final void mo39k() {
        AbstractC0676c<? extends InterfaceFutureC0708M<? extends InputT>> abstractC0676c = this.f1367l;
        mo20K(EnumC0736s.f1363a);
        if (isCancelled() && (abstractC0676c != null)) {
            boolean m45v = m45v();
            AbstractC0686m<? extends InterfaceFutureC0708M<? extends InputT>> it = abstractC0676c.iterator();
            while (it.hasNext()) {
                it.next().cancel(m45v);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.catvod.spider.merge.p060v.AbstractC0732o
    /* renamed from: r */
    public final String mo38r() {
        AbstractC0676c<? extends InterfaceFutureC0708M<? extends InputT>> abstractC0676c = this.f1367l;
        if (abstractC0676c != null) {
            String valueOf = String.valueOf(abstractC0676c);
            StringBuilder sb = new StringBuilder(valueOf.length() + 8);
            sb.append(atm.m897d("0C0F0E003E3D1947"));
            sb.append(valueOf);
            return sb.toString();
        }
        return super.mo38r();
    }

    @Override // com.github.catvod.spider.merge.p060v.AbstractC0741x
    /* renamed from: z */
    final void mo29z(Set<Throwable> set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        Throwable mo17b = mo17b();
        mo17b.getClass();
        while (mo17b != null && set.add(mo17b)) {
            mo17b = mo17b.getCause();
        }
    }
}
