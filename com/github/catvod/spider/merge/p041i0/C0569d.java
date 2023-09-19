package com.github.catvod.spider.merge.p041i0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p018S.C0207h;
import com.github.catvod.spider.merge.p035f0.C0521b;
import com.github.catvod.spider.merge.p035f0.C0524e;
import com.github.catvod.spider.merge.p035f0.C0525f;
import com.github.catvod.spider.merge.p035f0.InterfaceC0523d;
import com.github.catvod.spider.merge.p045k0.C0608a;
import java.math.BigDecimal;
import java.util.regex.Matcher;

/* renamed from: com.github.catvod.spider.merge.i0.d */
/* loaded from: classes.dex */
public final class C0569d implements InterfaceC0523d {
    @Override // com.github.catvod.spider.merge.p035f0.InterfaceC0523d
    /* renamed from: a */
    public final C0525f mo313a(C0524e c0524e) {
        Matcher matcher = C0521b.f943a.matcher(C0207h.m1170e(C0608a.m242b(atm.m897d("0B16162129201E")).mo313a(c0524e).m447e(), ""));
        if (matcher.find()) {
            BigDecimal bigDecimal = new BigDecimal(matcher.group());
            if (bigDecimal.compareTo(new BigDecimal(bigDecimal.longValue())) == 0) {
                return new C0525f(Long.valueOf(bigDecimal.longValue()));
            }
            return new C0525f(Double.valueOf(bigDecimal.doubleValue()));
        }
        return new C0525f(null);
    }

    @Override // com.github.catvod.spider.merge.p035f0.InterfaceC0523d
    public final String name() {
        return atm.m897d("040F17");
    }
}
