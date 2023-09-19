package com.github.catvod.spider.merge.p051n0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p047l0.InterfaceC0615b;
import com.github.catvod.spider.merge.p049m0.C0621a;
import com.github.catvod.spider.merge.p049m0.C0623c;
import com.github.catvod.spider.merge.p049m0.InterfaceC0622b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;

/* renamed from: com.github.catvod.spider.merge.n0.c */
/* loaded from: classes.dex */
public final class C0634c implements InterfaceC0615b {

    /* renamed from: a */
    private final String f1211a;

    /* renamed from: b */
    private volatile InterfaceC0615b f1212b;

    /* renamed from: c */
    private Boolean f1213c;

    /* renamed from: d */
    private Method f1214d;

    /* renamed from: e */
    private C0621a f1215e;

    /* renamed from: f */
    private Queue<C0623c> f1216f;

    /* renamed from: g */
    private final boolean f1217g;

    public C0634c(String str, Queue<C0623c> queue, boolean z) {
        this.f1211a = str;
        this.f1216f = queue;
        this.f1217g = z;
    }

    @Override // com.github.catvod.spider.merge.p047l0.InterfaceC0615b
    /* renamed from: a */
    public final void mo174a(String str, Throwable th) {
        InterfaceC0615b interfaceC0615b;
        if (this.f1212b != null) {
            interfaceC0615b = this.f1212b;
        } else if (this.f1217g) {
            interfaceC0615b = C0633b.f1210a;
        } else {
            if (this.f1215e == null) {
                this.f1215e = new C0621a(this, this.f1216f);
            }
            interfaceC0615b = this.f1215e;
        }
        interfaceC0615b.mo174a(str, th);
    }

    /* renamed from: b */
    public final boolean m173b() {
        Boolean bool = this.f1213c;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f1214d = this.f1212b.getClass().getMethod(atm.m897d("06151D"), InterfaceC0622b.class);
            this.f1213c = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f1213c = Boolean.FALSE;
        }
        return this.f1213c.booleanValue();
    }

    /* renamed from: c */
    public final boolean m172c() {
        return this.f1212b instanceof C0633b;
    }

    /* renamed from: d */
    public final boolean m171d() {
        return this.f1212b == null;
    }

    /* renamed from: e */
    public final void m170e(InterfaceC0622b interfaceC0622b) {
        if (m173b()) {
            try {
                this.f1214d.invoke(this.f1212b, interfaceC0622b);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C0634c.class == obj.getClass() && this.f1211a.equals(((C0634c) obj).f1211a);
    }

    /* renamed from: f */
    public final void m169f(InterfaceC0615b interfaceC0615b) {
        this.f1212b = interfaceC0615b;
    }

    @Override // com.github.catvod.spider.merge.p047l0.InterfaceC0615b
    public final String getName() {
        return this.f1211a;
    }

    public final int hashCode() {
        return this.f1211a.hashCode();
    }
}
