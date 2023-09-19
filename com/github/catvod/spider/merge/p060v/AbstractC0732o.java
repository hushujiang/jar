package com.github.catvod.spider.merge.p060v;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p061w.AbstractC0744a;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.github.catvod.spider.merge.v.o */
/* loaded from: classes.dex */
public abstract class AbstractC0732o<V> extends AbstractC0744a implements InterfaceFutureC0708M<V> {

    /* renamed from: d */
    static final boolean f1351d;

    /* renamed from: e */
    private static final Logger f1352e;

    /* renamed from: f */
    private static final AbstractC0718a f1353f;

    /* renamed from: g */
    private static final Object f1354g;

    /* renamed from: a */
    private volatile Object f1355a;

    /* renamed from: b */
    private volatile C0722e f1356b;

    /* renamed from: c */
    private volatile C0731n f1357c;

    static {
        boolean z;
        AbstractC0718a c0725h;
        try {
            z = Boolean.parseBoolean(System.getProperty(atm.m897d("0D0F1B032D7609151416392A181F1401623F0F141F072D2C0F251914223B0F1616143831051425162D2D191F"), atm.m897d("0C1B160629")));
        } catch (SecurityException unused) {
            z = false;
        }
        f1351d = z;
        f1352e = Logger.getLogger(AbstractC0732o.class.getName());
        Throwable th = null;
        try {
            c0725h = new C0730m();
            th = null;
        } catch (Throwable th2) {
            th = th2;
            try {
                c0725h = new C0723f(AtomicReferenceFieldUpdater.newUpdater(C0731n.class, Thread.class, atm.m897d("0B")), AtomicReferenceFieldUpdater.newUpdater(C0731n.class, C0731n.class, atm.m897d("08")), AtomicReferenceFieldUpdater.newUpdater(AbstractC0732o.class, C0731n.class, atm.m897d("09")), AtomicReferenceFieldUpdater.newUpdater(AbstractC0732o.class, C0722e.class, atm.m897d("08")), AtomicReferenceFieldUpdater.newUpdater(AbstractC0732o.class, Object.class, atm.m897d("0B")));
            } catch (Throwable th3) {
                th = th3;
                c0725h = new C0725h();
            }
        }
        f1353f = c0725h;
        if (th != null) {
            Logger logger = f1352e;
            Level level = Level.SEVERE;
            logger.log(level, atm.m897d("3F1409142A3D2B0E1518253B221F1605292A4A1309552E2A05111F1B6D"), th);
            logger.log(level, atm.m897d("391B1C100D2C05171316043D060A1F076C31195A180723330F145B"), th);
        }
        f1354g = new Object();
    }

    /* renamed from: j */
    private void m54j(StringBuilder sb) {
        String m897d = atm.m897d("37");
        try {
            Object m49p = m49p(this);
            sb.append(atm.m897d("392F3936090B39565A07292B1F160E4817"));
            m53l(sb, m49p);
            sb.append(m897d);
        } catch (CancellationException unused) {
            m897d = atm.m897d("293B34360914263F3E");
            sb.append(m897d);
        } catch (RuntimeException e) {
            sb.append(atm.m897d("3F34313B030F24565A162D2D191F472E"));
            sb.append(e.getClass());
            m897d = atm.m897d("4A0E1207232F045A1C0723354A1D1F01647137");
            sb.append(m897d);
        } catch (ExecutionException e2) {
            sb.append(atm.m897d("2C3B3339190A2F565A162D2D191F472E"));
            sb.append(e2.getCause());
            sb.append(m897d);
        }
    }

    /* renamed from: l */
    private void m53l(StringBuilder sb, Object obj) {
        String hexString;
        if (obj == null) {
            hexString = atm.m897d("040F1619");
        } else if (obj == this) {
            hexString = atm.m897d("1E1213066C3E1F0E0F0729");
        } else {
            sb.append(obj.getClass().getName());
            sb.append(atm.m897d("2A"));
            hexString = Integer.toHexString(System.identityHashCode(obj));
        }
        sb.append(hexString);
    }

    /* renamed from: m */
    private static void m52m(AbstractC0732o<?> abstractC0732o) {
        abstractC0732o.getClass();
        for (C0731n mo65g = f1353f.mo65g(abstractC0732o); mo65g != null; mo65g = mo65g.f1350b) {
            Thread thread = mo65g.f1349a;
            if (thread != null) {
                mo65g.f1349a = null;
                LockSupport.unpark(thread);
            }
        }
        abstractC0732o.mo39k();
        C0722e mo66f = f1353f.mo66f(abstractC0732o);
        C0722e c0722e = null;
        while (mo66f != null) {
            C0722e c0722e2 = mo66f.f1336c;
            mo66f.f1336c = c0722e;
            c0722e = mo66f;
            mo66f = c0722e2;
        }
        while (c0722e != null) {
            C0722e c0722e3 = c0722e.f1336c;
            Runnable runnable = c0722e.f1334a;
            runnable.getClass();
            if (runnable instanceof RunnableC0724g) {
                RunnableC0724g runnableC0724g = (RunnableC0724g) runnable;
                throw null;
            }
            Executor executor = c0722e.f1335b;
            executor.getClass();
            m51n(runnable, executor);
            c0722e = c0722e3;
        }
    }

    /* renamed from: n */
    private static void m51n(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f1352e;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(valueOf2.length() + valueOf.length() + 57);
            sb.append(atm.m897d("380F140125350F3F021629281E13151B6C2F021316106C3D121F19003831041D5A073936041B18192978"));
            sb.append(valueOf);
            sb.append(atm.m897d("4A0D130124780F021F16392C05085A"));
            sb.append(valueOf2);
            logger.log(level, sb.toString(), (Throwable) e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: o */
    private V m50o(Object obj) {
        if (obj instanceof C0719b) {
            Throwable th = ((C0719b) obj).f1331b;
            CancellationException cancellationException = new CancellationException(atm.m897d("3E1B091E6C2F0B095A162D36091F1619293C44"));
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof C0721d) {
            throw new ExecutionException(((C0721d) obj).f1332a);
        } else {
            if (obj == f1354g) {
                return null;
            }
            return obj;
        }
    }

    /* renamed from: p */
    private static <V> V m49p(Future<V> future) {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    /* renamed from: s */
    private void m48s(C0731n c0731n) {
        c0731n.f1349a = null;
        while (true) {
            C0731n c0731n2 = this.f1357c;
            if (c0731n2 == C0731n.f1348c) {
                return;
            }
            C0731n c0731n3 = null;
            while (c0731n2 != null) {
                C0731n c0731n4 = c0731n2.f1350b;
                if (c0731n2.f1349a != null) {
                    c0731n3 = c0731n2;
                } else if (c0731n3 != null) {
                    c0731n3.f1350b = c0731n4;
                    if (c0731n3.f1349a == null) {
                        break;
                    }
                } else if (!f1353f.mo67c(this, c0731n2, c0731n4)) {
                    break;
                }
                c0731n2 = c0731n4;
            }
            return;
        }
    }

    /* renamed from: a */
    public void mo62a(Runnable runnable, Executor executor) {
        C0722e c0722e;
        if (executor == null) {
            throw new NullPointerException(atm.m897d("2F021F16392C05085A022D2B4A140F192076"));
        }
        if (isDone() || (c0722e = this.f1356b) == C0722e.f1333d) {
            m51n(runnable, executor);
        }
        C0722e c0722e2 = new C0722e(runnable, executor);
        do {
            c0722e2.f1336c = c0722e;
            if (f1353f.mo69a(this, c0722e, c0722e2)) {
                return;
            }
            c0722e = this.f1356b;
        } while (c0722e != C0722e.f1333d);
        m51n(runnable, executor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.catvod.spider.merge.p061w.AbstractC0744a
    /* renamed from: b */
    public final Throwable mo17b() {
        if (this instanceof InterfaceC0726i) {
            Object obj = this.f1355a;
            if (obj instanceof C0721d) {
                return ((C0721d) obj).f1332a;
            }
            return null;
        }
        return null;
    }

    public boolean cancel(boolean z) {
        C0719b c0719b;
        Object obj = this.f1355a;
        if (!(obj == null) && !(obj instanceof RunnableC0724g)) {
            return false;
        }
        if (f1351d) {
            c0719b = new C0719b(z, new CancellationException(atm.m897d("2C0F0E003E3D44191B1B2F3D065253553B39195A191420340F1E54")));
        } else {
            c0719b = z ? C0719b.f1328c : C0719b.f1329d;
            c0719b.getClass();
        }
        while (!f1353f.mo68b(this, obj, c0719b)) {
            obj = this.f1355a;
            if (!(obj instanceof RunnableC0724g)) {
                return false;
            }
        }
        if (z) {
            mo18q();
        }
        m52m(this);
        if (obj instanceof RunnableC0724g) {
            ((RunnableC0724g) obj).getClass();
            throw null;
        }
        return true;
    }

    public V get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f1355a;
        if ((obj2 != null) && (!(obj2 instanceof RunnableC0724g))) {
            return m50o(obj2);
        }
        C0731n c0731n = this.f1357c;
        if (c0731n == C0731n.f1348c) {
            Object obj3 = this.f1355a;
            obj3.getClass();
            return m50o(obj3);
        }
        C0731n c0731n2 = new C0731n();
        do {
            f1353f.mo64h(c0731n2, c0731n);
            if (f1353f.mo67c(this, c0731n, c0731n2)) {
                do {
                    LockSupport.park(this);
                    if (Thread.interrupted()) {
                        m48s(c0731n2);
                        throw new InterruptedException();
                    }
                    obj = this.f1355a;
                } while (!((obj != null) & (!(obj instanceof RunnableC0724g))));
                return m50o(obj);
            }
            c0731n = this.f1357c;
        } while (c0731n != C0731n.f1348c);
        Object obj32 = this.f1355a;
        obj32.getClass();
        return m50o(obj32);
    }

    public boolean isCancelled() {
        return this.f1355a instanceof C0719b;
    }

    public boolean isDone() {
        Object obj = this.f1355a;
        return (!(obj instanceof RunnableC0724g)) & (obj != null);
    }

    /* renamed from: k */
    protected void mo39k() {
    }

    /* renamed from: q */
    protected void mo18q() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public String mo38r() {
        if (this instanceof ScheduledFuture) {
            long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
            StringBuilder sb = new StringBuilder(41);
            sb.append(atm.m897d("181F1714253603141D55283D061B034817"));
            sb.append(delay);
            sb.append(atm.m897d("4A170928"));
            return sb.toString();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public boolean mo47t(V v) {
        if (v == null) {
            v = (V) f1354g;
        }
        if (f1353f.mo68b(this, null, v)) {
            m52m(this);
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r7.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "0915175B2B37051D1610623B0517171A22761F0E1319623B051419003E2A0F140E5B"
            java.lang.String r2 = com.github.catvod.spider.merge.atm.m897d(r2)
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L22
            java.lang.Class r1 = r7.getClass()
            java.lang.String r1 = r1.getSimpleName()
            goto L2a
        L22:
            java.lang.Class r1 = r7.getClass()
            java.lang.String r1 = r1.getName()
        L2a:
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r7)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = "31090E14382D1947"
            java.lang.String r1 = com.github.catvod.spider.merge.atm.m897d(r1)
            r0.append(r1)
            boolean r1 = r7.isCancelled()
            java.lang.String r2 = "37"
            java.lang.String r2 = com.github.catvod.spider.merge.atm.m897d(r2)
            if (r1 == 0) goto L5d
            java.lang.String r1 = "293B34360914263F3E"
            java.lang.String r1 = com.github.catvod.spider.merge.atm.m897d(r1)
            r0.append(r1)
            goto Lec
        L5d:
            boolean r1 = r7.isDone()
            if (r1 == 0) goto L68
            r7.m54j(r0)
            goto Lec
        L68:
            int r1 = r0.length()
            java.lang.String r3 = "3A3F343105162D"
            java.lang.String r3 = com.github.catvod.spider.merge.atm.m897d(r3)
            r0.append(r3)
            java.lang.Object r3 = r7.f1355a
            boolean r4 = r3 instanceof com.github.catvod.spider.merge.p060v.RunnableC0724g
            java.lang.String r5 = "2F0219103C2C03151455383018150D1B6C3E1815175525351A161F1829361E1B0E1C2336505A"
            java.lang.String r5 = com.github.catvod.spider.merge.atm.m897d(r5)
            if (r4 == 0) goto La2
            java.lang.String r4 = "465A0910381E1F0E0F07296531"
            java.lang.String r4 = com.github.catvod.spider.merge.atm.m897d(r4)
            r0.append(r4)
            com.github.catvod.spider.merge.v.g r3 = (com.github.catvod.spider.merge.p060v.RunnableC0724g) r3
            r3.getClass()
            r3 = 0
            r0.append(r3)     // Catch: java.lang.StackOverflowError -> L94 java.lang.RuntimeException -> L96
            goto Ld9
        L94:
            r3 = move-exception
            goto L97
        L96:
            r3 = move-exception
        L97:
            r0.append(r5)
            java.lang.Class r3 = r3.getClass()
            r0.append(r3)
            goto Ld9
        La2:
            java.lang.String r3 = r7.mo38r()     // Catch: java.lang.StackOverflowError -> Lab java.lang.RuntimeException -> Lad
            java.lang.String r3 = com.github.catvod.spider.merge.p056r.C0671s.m114a(r3)     // Catch: java.lang.StackOverflowError -> Lab java.lang.RuntimeException -> Lad
            goto Lcb
        Lab:
            r3 = move-exception
            goto Lae
        Lad:
            r3 = move-exception
        Lae:
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r4 = r3.length()
            int r4 = r4 + 38
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r4)
            r6.append(r5)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
        Lcb:
            if (r3 == 0) goto Ldc
            java.lang.String r4 = "465A131B2A375721"
            java.lang.String r4 = com.github.catvod.spider.merge.atm.m897d(r4)
            r0.append(r4)
            r0.append(r3)
        Ld9:
            r0.append(r2)
        Ldc:
            boolean r3 = r7.isDone()
            if (r3 == 0) goto Lec
            int r3 = r0.length()
            r0.delete(r1, r3)
            r7.m54j(r0)
        Lec:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p060v.AbstractC0732o.toString():java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public boolean mo46u(Throwable th) {
        th.getClass();
        if (f1353f.mo68b(this, null, new C0721d(th))) {
            m52m(this);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v */
    public final boolean m45v() {
        Object obj = this.f1355a;
        return (obj instanceof C0719b) && ((C0719b) obj).f1330a;
    }

    public V get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f1355a;
        if ((obj != null) && (!(obj instanceof RunnableC0724g))) {
            return m50o(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C0731n c0731n = this.f1357c;
            if (c0731n == C0731n.f1348c) {
                Object obj2 = this.f1355a;
                obj2.getClass();
                return m50o(obj2);
            }
            C0731n c0731n2 = new C0731n();
            do {
                f1353f.mo64h(c0731n2, c0731n);
                if (f1353f.mo67c(this, c0731n, c0731n2)) {
                    do {
                        LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                        if (Thread.interrupted()) {
                            m48s(c0731n2);
                            throw new InterruptedException();
                        }
                        Object obj3 = this.f1355a;
                        if ((obj3 != null) && (!(obj3 instanceof RunnableC0724g))) {
                            return m50o(obj3);
                        }
                        nanos = nanoTime - System.nanoTime();
                    } while (nanos >= 1000);
                    m48s(c0731n2);
                } else {
                    c0731n = this.f1357c;
                }
            } while (c0731n != C0731n.f1348c);
            Object obj22 = this.f1355a;
            obj22.getClass();
            return m50o(obj22);
        }
        while (nanos > 0) {
            Object obj4 = this.f1355a;
            if ((obj4 != null) && (!(obj4 instanceof RunnableC0724g))) {
                return m50o(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String abstractC0732o = toString();
        String obj5 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj5.toLowerCase(locale);
        String lowerCase2 = timeUnit.toString().toLowerCase(locale);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
        sb.append(atm.m897d("3D1B1301293C4A"));
        sb.append(j);
        String m897d = atm.m897d("4A");
        sb.append(m897d);
        sb.append(lowerCase2);
        String sb2 = sb.toString();
        if (nanos + 1000 < 0) {
            String concat = String.valueOf(sb2).concat(atm.m897d("4A520A19392B4A"));
            long j2 = -nanos;
            long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(convert);
            boolean z = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String valueOf = String.valueOf(concat);
                StringBuilder sb3 = new StringBuilder(String.valueOf(lowerCase).length() + valueOf.length() + 21);
                sb3.append(valueOf);
                sb3.append(convert);
                sb3.append(m897d);
                sb3.append(lowerCase);
                String sb4 = sb3.toString();
                if (z) {
                    sb4 = String.valueOf(sb4).concat(atm.m897d("46"));
                }
                concat = String.valueOf(sb4).concat(m897d);
            }
            if (z) {
                String valueOf2 = String.valueOf(concat);
                StringBuilder sb5 = new StringBuilder(valueOf2.length() + 33);
                sb5.append(valueOf2);
                sb5.append(nanos2);
                sb5.append(atm.m897d("4A141B1B232B0F19151B282B4A"));
                concat = sb5.toString();
            }
            sb2 = String.valueOf(concat).concat(atm.m897d("0E1F16143571"));
        }
        if (isDone()) {
            throw new TimeoutException(String.valueOf(sb2).concat(atm.m897d("4A180F016C3E1F0E0F07297809151705203D1E1F1E552D2B4A0E131829371F0E5A10342803081F11")));
        }
        StringBuilder sb6 = new StringBuilder(String.valueOf(abstractC0732o).length() + String.valueOf(sb2).length() + 5);
        sb6.append(sb2);
        sb6.append(atm.m897d("4A1C15076C"));
        sb6.append(abstractC0732o);
        throw new TimeoutException(sb6.toString());
    }
}
