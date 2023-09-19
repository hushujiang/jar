package com.github.catvod.spider.merge.p060v;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p056r.C0672t;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* renamed from: com.github.catvod.spider.merge.v.m */
/* loaded from: classes.dex */
final class C0730m extends AbstractC0718a {

    /* renamed from: a */
    static final Unsafe f1342a;

    /* renamed from: b */
    static final long f1343b;

    /* renamed from: c */
    static final long f1344c;

    /* renamed from: d */
    static final long f1345d;

    /* renamed from: e */
    static final long f1346e;

    /* renamed from: f */
    static final long f1347f;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new C0729l());
            }
            try {
                f1344c = unsafe.objectFieldOffset(AbstractC0732o.class.getDeclaredField(atm.m897d("09")));
                f1343b = unsafe.objectFieldOffset(AbstractC0732o.class.getDeclaredField(atm.m897d("08")));
                f1345d = unsafe.objectFieldOffset(AbstractC0732o.class.getDeclaredField(atm.m897d("0B")));
                f1346e = unsafe.objectFieldOffset(C0731n.class.getDeclaredField(atm.m897d("0B")));
                f1347f = unsafe.objectFieldOffset(C0731n.class.getDeclaredField(atm.m897d("08")));
                f1342a = unsafe;
            } catch (Exception e) {
                int i = C0672t.f1276b;
                if (e instanceof RuntimeException) {
                    throw ((RuntimeException) e);
                }
                if (!(e instanceof Error)) {
                    throw new RuntimeException(e);
                }
                throw ((Error) e);
            }
        } catch (PrivilegedActionException e2) {
            throw new RuntimeException(atm.m897d("29150F19287804150E552536030E13142031101F5A1C222C18131406253B19"), e2.getCause());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0730m() {
        super((C0717W) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p060v.AbstractC0718a
    /* renamed from: a */
    public final boolean mo69a(AbstractC0732o<?> abstractC0732o, C0722e c0722e, C0722e c0722e2) {
        return C0728k.m71a(f1342a, abstractC0732o, f1343b, c0722e, c0722e2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p060v.AbstractC0718a
    /* renamed from: b */
    public final boolean mo68b(AbstractC0732o<?> abstractC0732o, Object obj, Object obj2) {
        return C0728k.m71a(f1342a, abstractC0732o, f1345d, obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p060v.AbstractC0718a
    /* renamed from: c */
    public final boolean mo67c(AbstractC0732o<?> abstractC0732o, C0731n c0731n, C0731n c0731n2) {
        return C0728k.m71a(f1342a, abstractC0732o, f1344c, c0731n, c0731n2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p060v.AbstractC0718a
    /* renamed from: f */
    public final C0722e mo66f(AbstractC0732o abstractC0732o) {
        C0722e c0722e;
        C0722e c0722e2 = C0722e.f1333d;
        do {
            c0722e = abstractC0732o.f1356b;
            if (c0722e2 == c0722e) {
                return c0722e;
            }
        } while (!C0728k.m71a(f1342a, abstractC0732o, f1343b, c0722e, c0722e2));
        return c0722e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p060v.AbstractC0718a
    /* renamed from: g */
    public final C0731n mo65g(AbstractC0732o abstractC0732o) {
        C0731n c0731n;
        C0731n c0731n2 = C0731n.f1348c;
        do {
            c0731n = abstractC0732o.f1357c;
            if (c0731n2 == c0731n) {
                return c0731n;
            }
        } while (!mo67c(abstractC0732o, c0731n, c0731n2));
        return c0731n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p060v.AbstractC0718a
    /* renamed from: h */
    public final void mo64h(C0731n c0731n, C0731n c0731n2) {
        f1342a.putObject(c0731n, f1347f, c0731n2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p060v.AbstractC0718a
    /* renamed from: i */
    public final void mo63i(C0731n c0731n, Thread thread) {
        f1342a.putObject(c0731n, f1346e, thread);
    }
}
