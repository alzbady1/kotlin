; Prevent function from DCE
@llvm.compiler.used = appending global [1 x i8*] [ i8* bitcast (void (i8*, i8*)* @test to i8*) ], section "llvm.metadata"

declare void @llvm.objc.clang.arc.use(...) nounwind

define void @test(i8* %a, i8* %b) {
  call void (...) @llvm.objc.clang.arc.use(i8* %a, i8* %b) nounwind
  ret void
}