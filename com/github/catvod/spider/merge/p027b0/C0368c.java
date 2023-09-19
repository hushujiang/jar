package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p024Z.C0280b;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.github.catvod.spider.merge.b0.c */
/* loaded from: classes.dex */
enum C0368c extends EnumC0313B {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0368c() {
        super(atm.m897d("23142E142E340F2E1F0D38"), 9, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.p027b0.EnumC0313B
    /* renamed from: d */
    public final boolean mo638d(AbstractC0341P abstractC0341P, C0365b c0365b) {
        String str;
        EnumC0313B enumC0313B = EnumC0313B.f641g;
        if (abstractC0341P.f705a == 5) {
            C0327I c0327i = (C0327I) abstractC0341P;
            String m831l = c0327i.m831l();
            str = EnumC0313B.f659y;
            if (m831l.equals(str)) {
                c0365b.m668r(this);
                return false;
            }
            ((ArrayList) c0365b.m719A()).add(c0327i.m831l());
            return true;
        }
        if (((ArrayList) c0365b.m719A()).size() > 0) {
            Iterator it = ((ArrayList) c0365b.m719A()).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (C0280b.m1056d(str2)) {
                    C0327I c0327i2 = new C0327I();
                    c0327i2.m832k(str2);
                    c0365b.m711I(c0327i2);
                } else {
                    c0365b.m668r(this);
                    if (C0280b.m1057c(c0365b.m649a().m973j0(), C0311A.f597A)) {
                        c0365b.m673o0(true);
                        C0327I c0327i3 = new C0327I();
                        c0327i3.m832k(str2);
                        c0365b.m690d0(c0327i3, enumC0313B);
                        c0365b.m673o0(false);
                    } else {
                        C0327I c0327i4 = new C0327I();
                        c0327i4.m832k(str2);
                        c0365b.m690d0(c0327i4, enumC0313B);
                    }
                }
            }
            c0365b.m699U();
        }
        c0365b.m665s0(c0365b.m695Y());
        return c0365b.mo645e(abstractC0341P);
    }
}
