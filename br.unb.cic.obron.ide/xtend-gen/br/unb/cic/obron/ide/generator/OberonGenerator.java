/**
 * generated by Xtext 2.25.0
 */
package br.unb.cic.obron.ide.generator;

import br.unb.cic.oberon.ast.OberonModule;
import br.unb.cic.oberon.ast.Statement;
import br.unb.cic.oberon.codegen.PaigesBasedGenerator;
import br.unb.cic.oberon.interpreter.Interpreter;
import br.unb.cic.oberon.parser.ScalaParser;
import br.unb.cic.oberon.tc.TypeChecker;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Exceptions;
import scala.Tuple2;
import scala.collection.immutable.List;

@SuppressWarnings("all")
public class OberonGenerator extends AbstractGenerator {
  /**
   * Generates the C code from an Oberon module.
   */
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    try {
      boolean _isPlatform = resource.getURI().isPlatform();
      if (_isPlatform) {
        IWorkspaceRoot _root = ResourcesPlugin.getWorkspace().getRoot();
        String _platformString = resource.getURI().toPlatformString(true);
        Path _path = new Path(_platformString);
        final String file = _root.getFile(_path).getRawLocation().toOSString();
        final java.nio.file.Path path = Paths.get(file);
        final String content = String.join("\n", Files.readAllLines(path));
        final OberonModule module = ScalaParser.parse(content);
        final PaigesBasedGenerator codeGenerator = new PaigesBasedGenerator(3);
        fsa.generateFile(path.getFileName().toString().replace(".oberon", ".c"), codeGenerator.generateCode(module));
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Executes the type checker on a Oberon module.
   * 
   * @arg content The string content of an Oberon module.
   */
  public List<Tuple2<Statement, String>> typeChecker(final String content) {
    final OberonModule module = ScalaParser.parse(content);
    final TypeChecker tc = new TypeChecker();
    return tc.visit(module);
  }
  
  /**
   * Executes the interpreter on a Oberon module.
   * 
   * @arg content The string content of an Oberon module.
   */
  public void interpreter(final String content) {
    final OberonModule module = ScalaParser.parse(content);
    final Interpreter i = new Interpreter();
    i.visit(module);
  }
}
