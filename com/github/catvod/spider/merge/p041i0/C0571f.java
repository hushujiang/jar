package com.github.catvod.spider.merge.p041i0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p023Y.C0277c;
import com.github.catvod.spider.merge.p025a0.AbstractC0299s;
import com.github.catvod.spider.merge.p025a0.C0293m;
import com.github.catvod.spider.merge.p025a0.C0302v;
import com.github.catvod.spider.merge.p029c0.C0459g;
import com.github.catvod.spider.merge.p029c0.InterfaceC0442P;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: com.github.catvod.spider.merge.i0.f */
/* loaded from: classes.dex */
final class C0571f implements InterfaceC0442P {

    /* renamed from: a */
    final /* synthetic */ Map f1037a;

    /* renamed from: b */
    final /* synthetic */ C0459g f1038b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0571f(Map map, C0459g c0459g) {
        this.f1037a = map;
        this.f1038b = c0459g;
    }

    @Override // com.github.catvod.spider.merge.p029c0.InterfaceC0442P
    /* renamed from: a */
    public final void mo315a(AbstractC0299s abstractC0299s, int i) {
    }

    @Override // com.github.catvod.spider.merge.p029c0.InterfaceC0442P
    /* renamed from: b */
    public final void mo314b(AbstractC0299s abstractC0299s, int i) {
        if (abstractC0299s instanceof C0302v) {
            C0302v c0302v = (C0302v) abstractC0299s;
            String str = i + atm.m897d("35") + c0302v.mo909z().hashCode();
            Integer num = (Integer) this.f1037a.get(str);
            Integer valueOf = num == null ? 1 : Integer.valueOf(num.intValue() + 1);
            this.f1037a.put(str, valueOf);
            C0293m c0293m = new C0293m(atm.m897d("2022252109003E"));
            c0293m.mo961v0(c0302v.m906L());
            c0293m.mo926c(atm.m897d("2F36253109083E32"), str);
            try {
                Method declaredMethod = AbstractC0299s.class.getDeclaredMethod(atm.m897d("191F0E252D2A0F140E3B233C0F"), AbstractC0299s.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(c0293m, c0302v.mo909z());
            } catch (Exception unused) {
            }
            C0277c.m1061n(c0293m, valueOf.intValue());
            this.f1038b.add(c0293m);
        }
    }
}
