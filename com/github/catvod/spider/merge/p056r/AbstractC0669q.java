package com.github.catvod.spider.merge.p056r;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.github.catvod.spider.merge.r.q */
/* loaded from: classes.dex */
public abstract class AbstractC0669q implements Iterator<String> {

    /* renamed from: b */
    private String f1265b;

    /* renamed from: c */
    final CharSequence f1266c;

    /* renamed from: d */
    final AbstractC0659g f1267d;

    /* renamed from: e */
    final boolean f1268e;

    /* renamed from: g */
    int f1270g;

    /* renamed from: a */
    private int f1264a = 2;

    /* renamed from: f */
    int f1269f = 0;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0669q(C0670r c0670r, CharSequence charSequence) {
        AbstractC0659g abstractC0659g;
        boolean z;
        int i;
        abstractC0659g = c0670r.f1271a;
        this.f1267d = abstractC0659g;
        z = c0670r.f1272b;
        this.f1268e = z;
        i = c0670r.f1274d;
        this.f1270g = i;
        this.f1266c = charSequence;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
        if (r3 >= r4) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
        if (r9.f1267d.mo136b(r9.f1266c.charAt(r3)) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
        if (r4 <= r3) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
        r8 = r4 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
        if (r9.f1267d.mo136b(r9.f1266c.charAt(r8)) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
        r4 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
        if (r9.f1268e == false) goto L54;
     */
    @Override // java.util.Iterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean hasNext() {
        /*
            r9 = this;
            int r0 = r9.f1264a
            r1 = 0
            r2 = 1
            r3 = 4
            if (r0 == r3) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            com.github.catvod.spider.merge.p056r.C0665m.m124h(r0)
            int r0 = r9.f1264a
            int r0 = com.github.catvod.spider.merge.p056r.C0653a.m139a(r0)
            if (r0 == 0) goto Lba
            r4 = 2
            if (r0 == r4) goto Lb9
            r0 = 3
            r9.f1264a = r3
        L1b:
            int r3 = r9.f1269f
        L1d:
            int r4 = r9.f1269f
            r5 = -1
            if (r4 == r5) goto Lad
            r6 = r9
            com.github.catvod.spider.merge.r.n r6 = (com.github.catvod.spider.merge.p056r.C0666n) r6
            com.github.catvod.spider.merge.r.o r7 = r6.f1260h
            com.github.catvod.spider.merge.r.g r7 = r7.f1261a
            java.lang.CharSequence r6 = r6.f1266c
            int r4 = r7.mo137a(r6, r4)
            if (r4 != r5) goto L3a
            java.lang.CharSequence r4 = r9.f1266c
            int r4 = r4.length()
            r9.f1269f = r5
            goto L3e
        L3a:
            int r6 = r4 + 1
            r9.f1269f = r6
        L3e:
            int r6 = r9.f1269f
            if (r6 != r3) goto L51
            int r6 = r6 + 1
            r9.f1269f = r6
            java.lang.CharSequence r4 = r9.f1266c
            int r4 = r4.length()
            if (r6 <= r4) goto L1d
            r9.f1269f = r5
            goto L1d
        L51:
            if (r3 >= r4) goto L64
            com.github.catvod.spider.merge.r.g r6 = r9.f1267d
            java.lang.CharSequence r7 = r9.f1266c
            char r7 = r7.charAt(r3)
            boolean r6 = r6.mo136b(r7)
            if (r6 == 0) goto L64
            int r3 = r3 + 1
            goto L51
        L64:
            if (r4 <= r3) goto L78
            com.github.catvod.spider.merge.r.g r6 = r9.f1267d
            java.lang.CharSequence r7 = r9.f1266c
            int r8 = r4 + (-1)
            char r7 = r7.charAt(r8)
            boolean r6 = r6.mo136b(r7)
            if (r6 == 0) goto L78
            r4 = r8
            goto L64
        L78:
            boolean r6 = r9.f1268e
            if (r6 == 0) goto L7f
            if (r3 != r4) goto L7f
            goto L1b
        L7f:
            int r6 = r9.f1270g
            if (r6 != r2) goto L9f
            java.lang.CharSequence r4 = r9.f1266c
            int r4 = r4.length()
            r9.f1269f = r5
        L8b:
            if (r4 <= r3) goto La2
            com.github.catvod.spider.merge.r.g r5 = r9.f1267d
            java.lang.CharSequence r6 = r9.f1266c
            int r7 = r4 + (-1)
            char r6 = r6.charAt(r7)
            boolean r5 = r5.mo136b(r6)
            if (r5 == 0) goto La2
            r4 = r7
            goto L8b
        L9f:
            int r6 = r6 - r2
            r9.f1270g = r6
        La2:
            java.lang.CharSequence r5 = r9.f1266c
            java.lang.CharSequence r3 = r5.subSequence(r3, r4)
            java.lang.String r3 = r3.toString()
            goto Lb0
        Lad:
            r9.f1264a = r0
            r3 = 0
        Lb0:
            r9.f1265b = r3
            int r3 = r9.f1264a
            if (r3 == r0) goto Lb9
            r9.f1264a = r2
            r1 = 1
        Lb9:
            r2 = r1
        Lba:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p056r.AbstractC0669q.hasNext():boolean");
    }

    @Override // java.util.Iterator
    public final String next() {
        if (hasNext()) {
            this.f1264a = 2;
            String str = this.f1265b;
            this.f1265b = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
