package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p025a0.C0293m;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.b0.x */
/* loaded from: classes.dex */
public enum C0418x extends EnumC0313B {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0418x() {
        super(atm.m897d("2314381A2821"), 6, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01e5, code lost:
        if (r44.m644f(r15) != false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0224, code lost:
        if (r44.m648b(r7) == false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x024a, code lost:
        if (r44.m648b(r7) == false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x029b, code lost:
        if (r44.m648b(r7) == false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02c1, code lost:
        if (r44.m648b(r7) == false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x042a, code lost:
        if (r44.m648b(r7) == false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x042c, code lost:
        r44.m668r(r42);
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x042f, code lost:
        r44.m693a0(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x0ac1, code lost:
        if (r44.m709K(r2).mo925d(com.github.catvod.spider.merge.atm.m897d("1E030A10")).equalsIgnoreCase(com.github.catvod.spider.merge.atm.m897d("02131E112936")) == false) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:606:0x0c76, code lost:
        if (r44.m718B(r0) != false) goto L422;
     */
    /* JADX WARN: Code restructure failed: missing block: B:632:0x0cfa, code lost:
        if (r44.m718B(r0) != false) goto L422;
     */
    /* JADX WARN: Code restructure failed: missing block: B:633:0x0cfc, code lost:
        r44.m644f(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:711:0x0e6b, code lost:
        if (com.github.catvod.spider.merge.p024Z.C0280b.m1057c(r1, com.github.catvod.spider.merge.p027b0.C0311A.f623o) != false) goto L284;
     */
    /* JADX WARN: Removed duplicated region for block: B:198:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:718:0x0330 A[SYNTHETIC] */
    @Override // com.github.catvod.spider.merge.p027b0.EnumC0313B
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo638d(com.github.catvod.spider.merge.p027b0.AbstractC0341P r43, com.github.catvod.spider.merge.p027b0.C0365b r44) {
        /*
            Method dump skipped, instructions count: 4126
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p027b0.C0418x.mo638d(com.github.catvod.spider.merge.b0.P, com.github.catvod.spider.merge.b0.b):boolean");
    }

    /* renamed from: e */
    final boolean m639e(AbstractC0341P abstractC0341P, C0365b c0365b) {
        abstractC0341P.getClass();
        String str = ((C0335M) abstractC0341P).f695e;
        ArrayList<C0293m> arrayList = c0365b.f840e;
        if (c0365b.m659y(str) == null) {
            c0365b.m668r(this);
            return false;
        }
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            C0293m c0293m = arrayList.get(size);
            if (c0293m.m973j0().equals(str)) {
                c0365b.m663u(str);
                if (!c0365b.m648b(str)) {
                    c0365b.m668r(this);
                }
                c0365b.m693a0(str);
            } else if (c0365b.m702R(c0293m)) {
                c0365b.m668r(this);
                return false;
            } else {
                size--;
            }
        }
        return true;
    }
}
